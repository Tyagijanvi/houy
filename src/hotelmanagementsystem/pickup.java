package hotelmanagementsystem;
import javax.swing.*;

//import hotelmanagementsystem.managerdepartment.ActionForW;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;
public class pickup extends JFrame implements ActionListener {
	JTable t1 ,t2;
	JLabel heading=new JLabel("PICK UP SERVICES");
	JLabel j1=new JLabel("NAME");
	JLabel j2=new JLabel("AGE");
	JLabel j3=new JLabel("GENDER");
	JLabel j4=new JLabel("COMPANY");
	JLabel j5=new JLabel("BRANCH");
	JLabel j8=new JLabel("AVILABLE");
	JLabel j6=new JLabel("PICK UP SERVICE");
	JLabel j7=new JLabel("TYPE OF CAR");
	String str1[]= {"fortuner","nova"};
	JComboBox cartype =new JComboBox(str1);
	JCheckBox available=new JCheckBox("Only display available");
	JButton jb1 = new JButton("SUBMIT");
	JButton j = new JButton("BACK");
	database db= new database();
	pickup()
	{
		heading.setForeground(Color.white);
		//heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(500,100,600,100);
		add(heading);
		//j1.setBounds(10,10,100,20);
		j1.setForeground(Color.WHITE);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		j1.setBounds(170,260,180,20);
		add(j1);
		//j2.setBounds(120,10,100,20);
		j2.setForeground(Color.WHITE);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		j2.setBounds(320,260,180,20);
		add(j2);
		//j3.setBounds(230,10,100,20);
		j3.setForeground(Color.WHITE);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		j3.setBounds(450,260,100,20);
		add(j3);
		//j4.setBounds(330,10,100,20);
		j4.setForeground(Color.WHITE);
		j4.setFont(new Font("Serif",Font.BOLD,20));
		j4.setBounds(590,260,120,20);
		add(j4);
	
		j5.setBounds(730,260,120,20);
		j5.setForeground(Color.WHITE);
		j5.setFont(new Font("Serif",Font.BOLD,20));
		//j5.setBounds(330,10,100,20);
		add(j4);
		add(j5);
		j6.setBounds(1000,260,190,20);
		j6.setForeground(Color.WHITE);
		j6.setFont(new Font("Serif",Font.BOLD,20));
		add(j6);
		j8.setBounds(870,260,120,20);
		j8.setForeground(Color.WHITE);
		j8.setFont(new Font("Serif",Font.BOLD,20));
		add(j8);
	//	j6.setFont(new Font("Tahoma",Font.PLAIN, 20));
	//	j6.setForeground(Color.BLACK);
     //   j6.setBounds(400,30,200,30);
     //   add(j6);
        j7.setFont(new Font("Serif",Font.BOLD, 20));
		j7.setForeground(Color.black);
        j7.setBounds(200,190,180,40);
        add(j7);
        
        cartype.setBounds(370,200,150,25);
        cartype.setForeground(Color.white);
        cartype.setBackground(Color.black);
        add(cartype);
        
        available.setBounds(650,200,150,25);
        available.setForeground(Color.white);
        available.setBackground(Color.black);
        add(available);
        
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(500,730,120,40);
        add(jb1);
		t1=new JTable();
		t1.setBounds(160,300,1000,400);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(new Font("Serif",Font.BOLD,20));
		
		j.addActionListener(this);
		jb1.addActionListener(new ActionForl ());
		
		try {
			db.connect();
			db.rst=db.stmt.executeQuery("select * from drivers");
			t1.setModel(DbUtils.resultSetToTableModel(db.rst));
			add(t1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		j.setBackground(Color.black);
		j.setForeground(Color.white);
		//j.addActionListener(this);
		j.setBounds(700,730,120,40);
		add(j);
		
		JLabel label = new JLabel(); 
	    label.setIcon(new ImageIcon("Icon1/login106.jpg")); 
	    Dimension size = label.getPreferredSize(); 
	    label.setBounds(-100,0,1870,800);
	    add(label);
	     
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setBounds(0,0,1920,1020);
		setVisible(true);
	}
  public static void main(String args[])
  {
	  new pickup();
  }

  public void actionPerformed(ActionEvent e)
	
	{
		setVisible(false);
    	//new managerdepartment();
	}
  class ActionForl implements ActionListener
  {
  public void actionPerformed(ActionEvent c ) 
  {
		try
		{
		db.connect();
		String l=(String) cartype.getSelectedItem();
			String q1="select* from drivers where branch='"+l+"'";
			 String q2="select* from drivers where avilable='Available' AND branch='"+l+"'";
			  
			  if(available.isSelected())
			  {
				  System.out.println("hello");
				db.rst1= db.stmt.executeQuery(q2);
				 System.out.println("hello");
				t1.setModel(DbUtils.resultSetToTableModel(db.rst1));
				  System.out.println("hello");
			
				     add(t1);
				     System.out.println("hello");
			  }
			  else
			  {
				  db.rst1= db.stmt.executeQuery(q1); 
				  System.out.println("hello");
				  t1.setModel(DbUtils.resultSetToTableModel(db.rst1));
			  }
			
		}  
			  catch(Exception g)
			  {
				  g.printStackTrace();
			  }
		  
	
  }
	
  }
}
