package hotelmanagementsystem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class updateroom extends JFrame implements ActionListener {
	Choice customer;
	JLabel j1=new JLabel("UPDATE ROOM STATUS");
	JLabel j2=new JLabel("CUSTOMER ID");
	JLabel j3=new JLabel("ROOM NUMBER");
	JTextField txt = new JTextField(" ");
	JLabel j4=new JLabel("AVAILABILITY");
	JTextField txt1 = new JTextField(" ");
	JLabel j5=new JLabel("CLEANING STATUS");
	JTextField txt2 = new JTextField(" ");
	JButton jb1=new JButton("CHECK");
	JButton jb2=new JButton("UPDATE");
	JButton jb3=new JButton("BACK");
	database db =new database();
updateroom()
{
	j1.setForeground(Color.white);
	//heading.setFont(new Font("tahoma",Font.BOLD, 40));
	j1.setFont(new Font("Serif",Font.BOLD,40));
	j1.setBounds(500,0,600,100);
	add(j1);
	
//	j1.setFont(new Font("Tohma",Font.PLAIN,25));
	//j1.setBounds(30,20,250,30);
	//j1.setForeground(Color.blue);
	//add(j1);
	customer = new Choice();
	customer.setForeground(Color.white);
	customer.setBackground(Color.BLACK);
	//heading.setFont(new Font("tahoma",Font.BOLD, 40));
	customer.setFont(new Font("Serif",Font.BOLD,15));
	customer.setBounds(750,110,150,25);
	add(customer);
	try
	{
		db.connect();
		db.rst=db.stmt.executeQuery("select * from customer");
		while(db.rst.next())
		{
			customer.add(db.rst.getString("no"));
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	j2.setForeground(Color.WHITE);
	j2.setFont(new Font("Serif",Font.BOLD,25));
	j2.setBounds(500,100,180,40);
//	j2.setBounds(30,80,100,20);
	add(j2);
	
	j3.setForeground(Color.WHITE);
	j3.setFont(new Font("Serif",Font.BOLD,25));
	j3.setBounds(500,140,200,40);
//	j3.setBounds(30,120,100,20);
	add(j3);
	
	txt.setForeground(Color.white);
	txt.setBackground(Color.BLACK);
	txt.setBounds(750,150,150,25);
	add(txt);
	
	j4.setForeground(Color.WHITE);
	j4.setFont(new Font("Serif",Font.BOLD,25));
	j4.setBounds(500,180,200,40);
//	j4.setBounds(30,160,100,20);
	add(j4);
	
	txt1.setForeground(Color.white);
	txt1.setBackground(Color.BLACK);
	txt1.setBounds(750,190,150,25);
	add(txt1);
	
	j5.setForeground(Color.WHITE);
	j5.setFont(new Font("Serif",Font.BOLD,25));
	j5.setBounds(500,220,250,40);
//	j5.setBounds(30,200,150,20);
	add(j5);
	
	txt2.setForeground(Color.white);
	txt2.setBackground(Color.BLACK);
	txt2.setBounds(750,230,150,25);
	add(txt2);
	
	jb1.setBackground(Color.black);
	jb1.setForeground(Color.white);
	jb1.setBounds(500,300,100,30);
	jb1.addActionListener(this);
	add(jb1);
	
	jb2.setBackground(Color.black);
	jb2.setForeground(Color.white);
	jb2.setBounds(650,300,100,30);
	jb2.addActionListener(this);
	add(jb2);
	
	jb3.setBackground(Color.black);
	jb3.setForeground(Color.white);
	jb3.setBounds(800,300,100,30);
	jb3.addActionListener(new ActionForX());
	add(jb3);
	
	JLabel label = new JLabel(); 
    label.setIcon(new ImageIcon("Icon1/login110.jpg")); 
    Dimension size = label.getPreferredSize(); 
    label.setBounds(0,-100,1530,900);
    add(label);
     
	
	setLayout(null);
	getContentPane().setBackground(Color.white);
	setBounds(0,0,1920,1020);
	setVisible(true);
}
public static void main(String[]args)
{
	new updateroom();
}
class ActionForX implements ActionListener
{
public void actionPerformed(ActionEvent o) {
managerdepartment i=new managerdepartment ();
}
}
public void actionPerformed(ActionEvent e)
{
	
	if(e.getActionCommand().equals("CHECK"))
	{
		
		String id= customer.getSelectedItem();
		String q1= "select * from customer where no='"+id+"'";
		try {
			db.connect();
			db.rst=db.stmt.executeQuery(q1);
			while(db.rst.next())
			{
				txt.setText(db.rst.getString("roomno"));
			}
			db.rst1=db.stmt.executeQuery("select * from room where roomno='"+txt.getText()+"'");
			while(db.rst1.next())
			{
				
				txt1.setText(db.rst1.getString("available"));
				txt2.setText(db.rst1.getString("status"));
			}
		}
		catch(Exception f)
		{
			f.printStackTrace();
		}
		
		}
	else if(e.getActionCommand().equals("UPDATE"))
	{
		String number =customer.getSelectedItem();
		String roomno= txt.getText();
		String a = txt1.getText();
		String status=txt2.getText();
	
		try {
			db.stmt.executeQuery("update room set available='"+a+"',status='"+status+"' where roomno='"+roomno+"'");
			JOptionPane.showMessageDialog(null, "DATA UPDATED SUCCESSFULLY");
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
