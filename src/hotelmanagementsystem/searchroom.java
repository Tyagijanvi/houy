package hotelmanagementsystem;
import javax.swing.*;
import hotelmanagementsystem.managerdepartment.ActionForW;
import java.awt.*;
import java.awt.Event.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import net.proteanit.sql.*;
public class searchroom extends JFrame implements ActionListener{
	JTable t1;
	JLabel heading=new JLabel("SEARCH ROOM");
	JLabel j1=new JLabel("ROOM NUMBER");
	JLabel j2=new JLabel("AVALIABILTY");
	JLabel j3=new JLabel("STATUS");
	JLabel j4=new JLabel("PRICE");
	JLabel j5=new JLabel("BED TYPE");
//	JLabel j6=new JLabel("Search for room");
	JLabel j7=new JLabel("BED TYPE");
	String str1[]= {"Single-bed","Double-bed"};
	JComboBox bedtype =new JComboBox(str1);
	JCheckBox available=new JCheckBox("Only display available");
	JButton jb1 = new JButton("SUBMIT");
	JButton j = new JButton("BACK");
	database db= new database();
	searchroom()
	{
		heading.setForeground(Color.BLACK);
		//heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(500,30,600,100);
		add(heading);
		
		//j1.setBounds(10,10,100,20);
		j1.setForeground(Color.black);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		j1.setBounds(150,220,180,20);
		add(j1);
	//	j2.setBounds(120,10,100,20);
		j2.setForeground(Color.black);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		j2.setBounds(350,220,180,20);
		add(j2);
		//j3.setBounds(230,10,100,20);
		j3.setForeground(Color.black);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		j3.setBounds(550,220,100,20);
		add(j3);
		//j4.setBounds(330,10,100,20);
		j4.setForeground(Color.black);
		j4.setFont(new Font("Serif",Font.BOLD,20));
		j4.setBounds(780,220,100,20);
		add(j4);
	//
		j5.setBounds(950,220,100,20);
		j5.setForeground(Color.black);
		j5.setFont(new Font("Serif",Font.BOLD,20));
		//j5.setBounds(330,10,100,20);
		add(j4);
		add(j5);
//		j6.setFont(new Font("Tahoma",Font.PLAIN, 20));
//			j6.setForeground(Color.black);
  //      j6.setBounds(400,30,200,30);
    //    add(j6);
        j7.setFont(new Font("Serif",Font.BOLD, 20));
		j7.setForeground(Color.black);
        j7.setBounds(160,140,100,20);
        add(j7);
       
        bedtype.setBounds(270,140,150,25);
        bedtype.setForeground(Color.white);
        bedtype.setBackground(Color.black);
        
        
       // bedtype.setBounds(150,100,150,25);
      //  bedtype.setBackground(Color.white);
        available.setBounds(650,140,150,25);
        available.setForeground(Color.white);
        available.setBackground(Color.black);
        
        
        add(available);
        add(bedtype);
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(500,700,120,30);
        add(jb1);
		t1=new JTable();
		t1.setBounds(140,250,1000,400);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(new Font("Serif",Font.BOLD,20));
		j.addActionListener(this);
		jb1.addActionListener(new ActionForl ());
		
		try {
			db.connect();
			db.rst=db.stmt.executeQuery("select * from room");
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
		j.setBounds(700,700,120,30);
		add(j);
		JLabel label = new JLabel(); 
	    label.setIcon(new ImageIcon("Icon1/login108.jpg")); 
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
	  new searchroom();
  }

  public void actionPerformed(ActionEvent e)
	
	{
		setVisible(false);
    	new managerdepartment();
	}
  class ActionForl implements ActionListener
  {
  public void actionPerformed(ActionEvent c ) 
  {
		try
		{
		//db.connect();
			String q1="select* from room where type='"+bedtype.getSelectedItem()+"'";
			  String q2="select* from room where available='Available' AND type='"+bedtype.getSelectedItem()+"'";
			  db.connect();
			  if(available.isSelected())
			  {
				 db.rst= db.stmt.executeQuery(q2);
				  t1.setModel(DbUtils.resultSetToTableModel(db.rst));
				     add(t1);
			  }
			  else
			  {
				  db.rst= db.stmt.executeQuery(q1); 
				  t1.setModel(DbUtils.resultSetToTableModel(db.rst));
				     add(t1);
			  }
			
		}  
			  catch(Exception g)
			  {
				  g.printStackTrace();
			  }
		  
	
  }
	
  }
  }
