package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;
public class room extends JFrame implements ActionListener{
	JTable t1;
	JLabel heading=new JLabel("ROOM DETAILS");
	JLabel j1=new JLabel("ROOM NUMBER");
	JLabel j2=new JLabel("AVALIABILTY");
	JLabel j3=new JLabel("STATUS");
	JLabel j4=new JLabel("PRICE");
	JLabel j5=new JLabel("BED TYPE");
	JButton j = new JButton("BACK");
	database db= new database();
	room()
	{
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(600,50,600,100);
		add(heading);
		
		//j1.setBounds(10,10,100,20);
		j1.setForeground(Color.white);
		j1.setFont(new Font("Serif",Font.BOLD,20));
		j1.setBounds(400,220,180,20);
		add(j1);
	//	j2.setBounds(120,10,100,20);
		j2.setForeground(Color.white);
		j2.setFont(new Font("Serif",Font.BOLD,20));
		j2.setBounds(568,220,180,20);
		add(j2);
		//j3.setBounds(230,10,100,20);
		j3.setForeground(Color.white);
		j3.setFont(new Font("Serif",Font.BOLD,20));
		j3.setBounds(725,220,100,20);
		add(j3);
		//j4.setBounds(330,10,100,20);
		j4.setForeground(Color.white);
		j4.setFont(new Font("Serif",Font.BOLD,20));
		j4.setBounds(882,220,100,20);
		add(j4);
	//
		j5.setBounds(1040,220,100,20);
		j5.setForeground(Color.white);
		j5.setFont(new Font("Serif",Font.BOLD,20));
		//j5.setBounds(330,10,100,20);
		add(j4);
		add(j5);
		t1=new JTable();
		t1.setBounds(400,250,800,400);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(new Font("Serif",Font.BOLD,20));
		
		add(t1);
		try {
			db.connect();
			db.rst=db.stmt.executeQuery("select * from room");
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
	  new room();
  }
  public void actionPerformed(ActionEvent e)
	{
    	setVisible(false);
    	new managerdepartment();
	}
}
