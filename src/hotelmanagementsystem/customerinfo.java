package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;
public class customerinfo extends JFrame implements ActionListener {
	JTable t1;
	JLabel heading=new JLabel("CUSTOMER INFORMATION");
	JLabel j1=new JLabel("ID");
	JLabel j2=new JLabel("ID NO.");
	JLabel j3=new JLabel("NAME");
	JLabel j4=new JLabel("GENDER");
	JLabel j5=new JLabel("COUNTRY");
	JLabel j6=new JLabel("ROOM NO");
	JLabel j7=new JLabel("DEPOIST");
	//JLabel j8=new JLabel("ADHAR NUMBER");
	JButton j = new JButton("BACK");
	database db= new database();
	customerinfo()
	{
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(500,50,600,100);
		add(heading);
		//j1.setBounds(10,10,100,20);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		j1.setBounds(50,200,100,20);
		add(j1);
	//	j2.setBounds(120,10,100,20);
		j2.setForeground(Color.WHITE);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		j2.setBounds(200,200,100,20);
		add(j2);
		//j3.setBounds(230,10,100,20);
		j3.setForeground(Color.WHITE);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		j3.setBounds(410,200,100,20);
		add(j3);
		//j4.setBounds(330,10,100,20);
		j4.setForeground(Color.WHITE);
		j4.setFont(new Font("Serif",Font.BOLD,20));
		j4.setBounds(570,200,100,20);
		add(j4);
	//
		//j5.setBounds(410,10,100,20);
		j5.setForeground(Color.WHITE);
		j5.setFont(new Font("Serif",Font.BOLD,20));
		j5.setBounds(770,200,100,20);
		
		j6.setBounds(960,200,100,20);
		j6.setForeground(Color.WHITE);
		j6.setFont(new Font("Serif",Font.BOLD,20));
		
		j7.setBounds(1130,200,100,20);
		j7.setForeground(Color.WHITE);
		j7.setFont(new Font("Serif",Font.BOLD,20));
		
		//j8.setBounds(630,10,100,20);
		//j8.setForeground(Color.white);
		//j8.setFont(new Font("Serif",Font.BOLD,20));
		//j8.setBounds(330,10,100,20);
		add(j4);
		add(j5);
		add(j6);
		add(j7);
		//add(j8);
		
		
	     
		t1=new JTable();
		t1.setBounds(0,250,1500,400);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(new Font("Serif",Font.BOLD,20));
		add(t1);
		try {
			db.connect();
			db.rst=db.stmt.executeQuery("select * from customer");
			t1.setModel(DbUtils.resultSetToTableModel(db.rst));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		j.setBackground(Color.black);
		j.setForeground(Color.white);
		j.addActionListener(this);
		j.setBounds(700,700,120,30);
		add(j);
		JLabel label = new JLabel(); 
	    label.setIcon(new ImageIcon("Icon1/login99.jpg")); 
	    Dimension size = label.getPreferredSize(); 
	    label.setBounds(0,-90,1920,900);
	    add(label);
		
	     
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setBounds(0,0,1920,1020);
		setVisible(true);
	}
  public static void main(String args[])
  {
	  new customerinfo();
  }
  public void actionPerformed(ActionEvent e)
	{
    	setVisible(false);
    	new customerdepartment();
	}
	

}
