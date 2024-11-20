package hotelmanagementsystem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import hotelmanagementsystem.dashboard.ActionForX;

import java.util.Date;
public class checkout extends JFrame implements ActionListener{
	JLabel label = new JLabel();
	
	
	JLabel j1=new JLabel("CHECK OUT STATUS");
	JLabel j2=new JLabel("CUSTOMER ID");
	JLabel j3=new JLabel("ROOM NO");
	JLabel j4=new JLabel(" ");
	JLabel j5=new JLabel("CHECK IN TIME");
	JLabel j6=new JLabel(" ");
	JLabel j7=new JLabel("CHECK OUT TIME");
	JButton jb1=new JButton("CHECKOUT");
	//JButton jb2=new JButton("UPDATE");
	JButton jb3=new JButton("BACK");
	Choice customer;
	database db = new database();
checkout()
{
	j1.setForeground(Color.black);
//	j1.setFont(new Font("tahoma",Font.BOLD, 40));
    j1.setFont(new Font("Serif",Font.BOLD,40));
	j1.setBounds(600,40,600,100);
	//j1.setFont(new Font("Tohma",Font.PLAIN,20));
	//j1.setBounds(90,20,200,30);
	add(j1);
	
	customer = new Choice();
	customer.setBackground(Color.black);
	customer.setForeground(Color.white);
	customer.setBounds(850,160,200,40);
	//customer.setBounds(150,80,150,25);
	add(customer);
	
	j2.setBackground(Color.black);
	j2.setForeground(Color.white);
	j2.setFont(new Font("Serif",Font.BOLD,25));
	j2.setBounds(600,150,500,40);
	add(j2);
	
	j3.setBackground(Color.black);
	j3.setForeground(Color.white);
	j3.setFont(new Font("Serif",Font.BOLD,25));
	j3.setBounds(600,200,500,40);
	//j3.setBounds(30,130,100,30);
	add(j3);
	
	j4.setBackground(Color.black);
	j4.setForeground(Color.white);
	j4.setFont(new Font("Serif",Font.BOLD,25));
	j4.setBounds(600,250,500,40);
	add(j4);
	
	j5.setBackground(Color.black);
	j5.setForeground(Color.white);
	j5.setFont(new Font("Serif",Font.BOLD,25));
	j5.setBounds(600,300,500,40);
	add(j5);
	
	j6.setBackground(Color.black);
	j6.setForeground(Color.white);
	j6.setFont(new Font("Serif",Font.BOLD,25));
	j6.setBounds(600,350,500,40);
	add(j6);
	
	j7.setBackground(Color.black);
	j7.setForeground(Color.white);
	j7.setFont(new Font("Serif",Font.BOLD,25));
	j7.setBounds(600,400,500,40);
	add(j7);
	
	Date date=new Date();
	
	JLabel j8=new JLabel(" "+date);
	j8.setBackground(Color.black);
	j8.setForeground(Color.white);
	j8.setFont(new Font("Serif",Font.BOLD,25));
	j8.setBounds(600,450,500,40);
//	j8.setBounds(180,230,200,30);
	add(j8);
	try
	{
		db.connect();
		db.rst=db.stmt.executeQuery("select * from customer");
		while(db.rst.next())
		{
			customer.add(db.rst.getString("no"));
			j4.setText(db.rst.getString("roomno"));
			//j6.setText(db.rst.getString("chekintime"));
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	jb1.setBackground(Color.black);
	jb1.setForeground(Color.white);
	jb1.setBounds(600,500,150,40);
	jb1.addActionListener(this);
	add(jb1);
	
	jb3.setBackground(Color.black);
	jb3.setForeground(Color.white);
	jb3.setBounds(800,500,150,40);
	jb3.addActionListener(new ActionForX());
	add(jb3);
	label.setIcon(new ImageIcon("Icon1/login102.jpg")); 
    Dimension size = label.getPreferredSize(); 
    label.setBounds(-270,-190,2000,1020);
    add(label);
	getContentPane().setBackground(Color.white);
setLayout(null);
setBounds(0,0,1920,1020);

setVisible(true);
}
public static void main(String args[])
{
	new checkout();
}
class ActionForX implements ActionListener
{
public void actionPerformed(ActionEvent o) {
customerdepartment i=new customerdepartment ();
}
}
public void actionPerformed(ActionEvent e)
{
	if(e.getActionCommand().equals("CHECKOUT"))
	{
		String f = j4.getText();
		String q1="delete from customer where no='"+customer.getSelectedItem()+"'";
		String q2="update room set available='empty' where roomno='"+f+"'";
		try
		{
			db.connect();
			db.stmt.executeUpdate(q1);
			db.stmt.executeUpdate(q2);
			JOptionPane.showMessageDialog(null, "CHECKOUT DONE");
			setVisible(false);
			new reception();
			
		}
		catch(Exception r)
		{
			r.printStackTrace();
		}
}
	else
	{
		setVisible(false);
		new reception();
	}
}
}
