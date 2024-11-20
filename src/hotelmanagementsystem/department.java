package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.*;
public class department extends JFrame implements ActionListener{
	  JTable t1;
      JLabel label = new JLabel();
      JLabel labels = new JLabel();
      JLabel heading=new JLabel("DEPARTMENT");
		JLabel j1=new JLabel("DEPARTMENT");
		JLabel j2=new JLabel("BUDGET");
		JButton j = new JButton("BACK");
		database db= new database();
		department()
		{
			heading.setForeground(Color.white);
			heading.setFont(new Font("tahoma",Font.BOLD, 40));
			heading.setFont(new Font("Serif",Font.BOLD,40));
			heading.setBounds(600,40,600,100);
			add(heading);
			
			//j1.setBounds(10,10,100,20);
			j1.setForeground(Color.white);
			j1.setFont(new Font("Serif",Font.BOLD,20));
			j1.setBounds(500,200,200,20);
			add(j1);
		//	j2.setBounds(120,10,100,20);
			j2.setForeground(Color.white);
			j2.setFont(new Font("Serif",Font.BOLD,20));
			j2.setBounds(800,200,100,20);
			add(j2);
			//j3.setBounds(230,10,100,20);
			t1=new JTable();
			t1.setBounds(400,250,700,200);
			t1.setFont(new Font("Serif",Font.BOLD,17));
			t1.setBackground(Color.black);
			t1.setForeground(Color.white);
			add(t1);
			
			label.setIcon(new ImageIcon("Icon1/login99.jpg")); 
	        Dimension size = label.getPreferredSize(); 
	        label.setBounds(0,0,1920,1020);
	        add(label);
	       
			try {
				db.connect();
				db.rst=db.stmt.executeQuery("select * from department");
				t1.setModel(DbUtils.resultSetToTableModel(db.rst));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			j.setBackground(Color.black);
			j.setForeground(Color.white);
			j.addActionListener(this);
			j.setBounds(100,250,120,30);
			add(j);
	
			setLayout(null);
			getContentPane().setBackground(Color.white);
			setBounds(0,0,1920,1020);
			setVisible(true);
		}
	  public static void main(String args[])
	  {
		  new department();
	  }
	  public void actionPerformed(ActionEvent e)
		{
	    	setVisible(false);
	    	new managerdepartment();
		}
}

