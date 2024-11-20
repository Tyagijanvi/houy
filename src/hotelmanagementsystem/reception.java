package hotelmanagementsystem;
import javax.swing.*;
//import hotelmangementsystem.login.ActionForB;
//import javax.swing.*;
import java.awt.Font;
import java.awt.Event.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.ActionListener;
public class reception extends JFrame implements ActionListener {

    JButton j1= new JButton("CUSTOMER DEPARTMENT");
	JButton j2= new JButton("MANAGER DEPARTMENT");
	JButton j3= new JButton("LOGOUT");
	JButton j4= new JButton("BACK");

	JLabel label = new JLabel();
	reception()
	{
		
        j1.setBounds(480,570,200,40);
		j1.setBackground(Color.black);
		j1.setForeground(Color.white);
		add(j1);
		
		j2.setBounds(730,570,200,40);
		j2.setBackground(Color.black);
		j2.setForeground(Color.white);
		add(j2);
		
		j3.setBounds(500,670,150,30);
		j3.setBackground(Color.black);
		j3.setForeground(Color.white);
		add(j3);
		
		j4.setBounds(750,670,150,30);
		j4.setBackground(Color.black);
		j4.setForeground(Color.white);
		add(j4);
		
		
		label.setIcon(new ImageIcon("Icon1/login56.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(-200,0,1920,1020);
        add(label);
		
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setBounds(0,0,1920,1020);
		setVisible(true);
		 j1.addActionListener(this);
		 j2.addActionListener(new ActionForB());
		 j3.addActionListener(new ActionForD());
		 j4.addActionListener(new ActionForW());
	}
public static void main(String args[])
{
	new reception();
}
public void actionPerformed (ActionEvent e)
{
new customerdepartment ();
}
class ActionForB implements ActionListener
{
public void actionPerformed(ActionEvent o) {
managerdepartment i=new managerdepartment();
}
}
class ActionForD implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
first l=new first ();
}
}
class ActionForW implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
dashboard a=new dashboard ();
}
}
}
