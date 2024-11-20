package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;
public class employeeinfo extends JFrame implements ActionListener{
	JTable t1;
	JLabel heading=new JLabel("EMPLOYEE INFORMATION");
	JLabel j1=new JLabel("NAME");
	JLabel j2=new JLabel("AGE");
	JLabel j3=new JLabel("GENDER");
	JLabel j4=new JLabel("JOB");
	JLabel j5=new JLabel("SALARY");
	JLabel j6=new JLabel("PHONE");
	JLabel j7=new JLabel("EMAIL");
	JLabel j8=new JLabel("ADHAR NUMBER");
	JButton j = new JButton("BACK");
	database db= new database();
	employeeinfo()
	{
		heading.setForeground(Color.white);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(500,60,600,100);
		add(heading);
		
		//j1.setBounds(10,10,100,20);
		j1.setForeground(Color.white);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		j1.setBounds(10,250,100,20);
		add(j1);
	//	j2.setBounds(110,10,100,20);
		j2.setForeground(Color.white);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		j2.setBounds(200,250,100,20);
		add(j2);
		//j3.setBounds(230,10,100,20);
		j3.setForeground(Color.white);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		j3.setBounds(400,250,100,20);
		add(j3);
		//j4.setBounds(330,10,100,20);
		j4.setForeground(Color.white);
		j4.setFont(new Font("Serif",Font.BOLD,20));
		j4.setBounds(600,250,100,20);
		add(j4);
	//
		//j5.setBounds(410,10,100,20);
		j5.setForeground(Color.white);
		j5.setFont(new Font("Serif",Font.BOLD,20));
		j5.setBounds(780,250,100,20);
		
		j6.setBounds(970,250,100,20);
		j6.setForeground(Color.white);
		j6.setFont(new Font("Serif",Font.BOLD,20));
		
		j7.setBounds(1180,250,100,20);
		j7.setForeground(Color.white);
		j7.setFont(new Font("Serif",Font.BOLD,20));
		
		j8.setBounds(1350,250,180,20);
		j8.setForeground(Color.white);
		j8.setFont(new Font("Serif",Font.BOLD,20));
		//j6.setBounds(330,10,100,20);
		add(j4);
		add(j5);
		add(j6);
		add(j7);
		add(j8);
		t1=new JTable();
		t1.setBounds(0,280,1530,400);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		add(t1);
		try {
			db.connect();
			db.rst=db.stmt.executeQuery("select * from employee1");
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
	  new employeeinfo();
  }
  public void actionPerformed(ActionEvent e)
	{
    	setVisible(false);
    	new managerdepartment();
	}

}
