package hotelmanagementsystem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class updatecheck extends JFrame implements ActionListener{
	Choice customer;
	JLabel label = new JLabel();
	JLabel j1=new JLabel("UPDATE STATUS");
	JLabel j2=new JLabel("CUSTOMER ID");
	JLabel j3=new JLabel("ROOM NUMBER");
	JTextField txt = new JTextField(" ");
	JLabel j4=new JLabel("NAME");
	JTextField txt1 = new JTextField(" ");
	JLabel j5=new JLabel("CHECK-IN-TIME");
	JTextField txt2 = new JTextField(" ");
	JLabel j6=new JLabel("AMOUNT PAID");
	JTextField txt3 = new JTextField(" ");
	JLabel j7=new JLabel("PENDING AMOUNT");
	JTextField txt4= new JTextField(" ");
	JButton jb1=new JButton("CHECK");
	JButton jb2=new JButton("UPDATE");
	JButton jb3=new JButton("BACK");
	database db =new database();
updatecheck()
{
	j1.setForeground(Color.black);
    j1.setFont(new Font("Serif",Font.BOLD,40));
	j1.setBounds(400,-10,600,100);
	//j1.setFont(new Font("Tohma",Font.PLAIN,20));
	//j1.setBounds(90,20,200,30);
	add(j1);
	customer = new Choice();
	customer.setBounds(550,90,150,40);
	customer.setBackground(Color.black);
	customer.setForeground(Color.white);
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
	j2.setBackground(Color.white);
	j2.setForeground(Color.black);
	j2.setFont(new Font("Serif",Font.BOLD,25));
	j2.setBounds(300,80,200,40);
	add(j2);
	
	j3.setBackground(Color.white);
	j3.setForeground(Color.black);
	j3.setFont(new Font("Serif",Font.BOLD,25));
	j3.setBounds(300,120,200,40);
	add(j3);
	txt.setBounds(550,125,150,25);
	txt.setBackground(Color.black);
	txt.setForeground(Color.white);
	add(txt);
	
	j4.setBackground(Color.white);
	j4.setForeground(Color.black);
	j4.setFont(new Font("Serif",Font.BOLD,25));
	j4.setBounds(300,160,200,40);
	add(j4);
	txt1.setBackground(Color.black);
	txt1.setForeground(Color.white);
	txt1.setBounds(550,165,150,25);
	add(txt1);
	
	
	//j4.setBackground(Color.black);
	//j4.setForeground(Color.white);
	//j4.setFont(new Font("Serif",Font.BOLD,25));
	//j4.setBounds(30,160,100,20);
	//add(j4);
	
	//j2.setForeground(Color.white);
	//j2.setFont(new Font("Serif",Font.BOLD,25));
	//txt1.setBounds(200,160,150,25);

	
	j5.setBackground(Color.white);
	j5.setForeground(Color.black);
	j5.setFont(new Font("Serif",Font.BOLD,25));
	j5.setBounds(300,200,250,40);
	add(j5);
	
	txt2.setBackground(Color.black);
	txt2.setForeground(Color.white);
	txt2.setBounds(550,205,150,25);
	add(txt2);
	j6.setBounds(300,240,200,40);
	j6.setFont(new Font("Serif",Font.BOLD,25));
	j6.setBackground(Color.white);
	j6.setForeground(Color.black);
	add(j6);
	
	txt3.setBackground(Color.black);
	txt3.setForeground(Color.white);
	txt3.setBounds(550,245,150,25);
	add(txt3);
	j7.setBounds(300,280,250,40);
	j7.setBackground(Color.white);
	j7.setForeground(Color.black);
	j7.setFont(new Font("Serif",Font.BOLD,25));
	add(j7);
	
	txt4.setBackground(Color.black);
	txt4.setForeground(Color.white);
	txt4.setBounds(550,290,150,25);
	add(txt4);
	
	jb1.setBackground(Color.black);
	jb1.setForeground(Color.white);
	jb1.setBounds(300,360,120,40);
	jb1.addActionListener(this);
	add(jb1);
	
	jb2.setBackground(Color.black);
	jb2.setForeground(Color.white);
	jb2.setBounds(450,360,120,40);
	jb2.addActionListener(this);
	add(jb2);
	
	jb3.setBackground(Color.black);
	jb3.setForeground(Color.white);
	jb3.setBounds(600,360,120,40);
	jb3.addActionListener(this);
	add(jb3);
	
	label.setIcon(new ImageIcon("Icon1/login109.jpg")); 
    Dimension size = label.getPreferredSize(); 
    label.setBounds(-30,-70,1920,1020);
    add(label);
	
	setLayout(null);
	getContentPane().setBackground(Color.white);
	setBounds(0,0,1920,1020);
	setVisible(true);
}
public static void main(String[]args)
{
	new updatecheck();
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
				txt1.setText(db.rst.getString("name"));
				txt2.setText(db.rst.getString("checkintime"));
				txt3.setText(db.rst.getString("deposit"));
			}
			String q= "select * from room where roomno='"+txt.getText()+"'";
			db.rst1=db.stmt.executeQuery(q);
			while(db.rst1.next())
			{
				String price=db.rst1.getString("price");
				
				int a=Integer.valueOf(price);
				int b=Integer.parseInt(txt3.getText());
				int amtpaid=a-b;
				txt4.setText("" +amtpaid);
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
		String name = txt1.getText();
		String checkintime=txt2.getText();
		String depoist = txt3.getText();
		try {
			db.stmt.executeQuery("update customer set roomno='"+roomno+"',name='"+name+"',deposit='"+depoist+"' where no='"+number+"'");
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
	}
}
}
