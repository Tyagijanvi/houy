package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
public class managerdepartment extends JFrame implements ActionListener {
	JLabel heading=new JLabel("MANAGER DEPARTMENT");
	JButton j1= new JButton("ROOMS");
	JButton j2= new JButton("DEPARTMENTS");
	JButton j3= new JButton("ALL EMPLOYEE");
	JButton j4= new JButton("MANAGER INFO");
	JButton j5= new JButton("UPDATE STATUS");
	JButton j6= new JButton("ROOM UPDATE STATUS");
	JButton j7= new JButton("PICK UP SERVICES");
	JButton j8= new JButton("SEARCH ROOMS");
	JButton j9= new JButton("LOGOUT");
	JButton j10= new JButton("BACK");
	JLabel label = new JLabel();
	managerdepartment()
	{
		heading.setForeground(Color.BLACK);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(900,50,600,100);
		add(heading);
		
		j1.setBounds(1000,140,200,40);
		j1.setBackground(Color.black);
		j1.setForeground(Color.white);
		add(j1);
		
		j2.setBounds(1000,200,200,40);
		j2.setBackground(Color.black);
		j2.setForeground(Color.white);
		add(j2);
		
		j3.setBounds(1000,260,200,40);
		j3.setBackground(Color.black);
		j3.setForeground(Color.white);
		add(j3);
		
		j4.setBounds(1000,320,200,40);
		j4.setBackground(Color.black);
		j4.setForeground(Color.white);
		add(j4);
		
		j5.setBounds(1000,380,200,40);
		j5.setBackground(Color.black);
		j5.setForeground(Color.white);
		add(j5);
		
		j6.setBounds(1000,440,200,40);
		j6.setBackground(Color.black);
		j6.setForeground(Color.white);
		add(j6);
		
		j7.setBounds(1000,500,200,40);
		j7.setBackground(Color.black);
		j7.setForeground(Color.white);
		add(j7);
		
		j8.setBounds(1000,560,200,40);
		j8.setBackground(Color.black);
		j8.setForeground(Color.white);
		add(j8);
		
		j9.setBounds(930,620,150,40);
		j9.setBackground(Color.black);
		j9.setForeground(Color.white);
		add(j9);
		
		j10.setBounds(1140,620,150,40);
		j10.setBackground(Color.black);
		j10.setForeground(Color.white);
		add(j10);
		
		label.setIcon(new ImageIcon("Icon1/login72.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(-300,-200,1980,1020);
        add(label);
		
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setBounds(0,0,1920,1020);
		setVisible(true);
		j1.addActionListener(this);
	j2.addActionListener(new ActionFora ());
		j3.addActionListener(new ActionForl ());
		j4.addActionListener(new ActionFors ());
		j5.addActionListener(new ActionFork ());
		j6.addActionListener(new ActionForh ());
		j7.addActionListener(new ActionForo ());
		j8.addActionListener(new ActionForm ());
		j9.addActionListener(new ActionForW ());
		j10.addActionListener(new ActionForB());
	}
public static void main(String args[])
{
	new managerdepartment();
}
public void actionPerformed(ActionEvent e)
{
	new room();
}
class ActionForW implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
	first a=new first();
}
}
class ActionFora implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
	department a=new department();
}
}
class ActionForl implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
	employeeinfo b=new employeeinfo();
}
}
class ActionFors implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
	mangerinfo b=new mangerinfo();
}
}
class ActionForB implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
reception a=new reception ();
}
}
class ActionFork implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
updatecheck a=new updatecheck ();
}
}
class ActionForm implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
searchroom a=new searchroom ();
}
}
class ActionForh implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
updateroom a=new updateroom ();
}
}
class ActionForo implements ActionListener
{
public void actionPerformed(ActionEvent c ) 
{
pickup a=new pickup ();
}
}
}
