package hotelmanagementsystem;
import javax.swing.*;

import hotelmanagementsystem.managerdepartment.ActionForB;
import hotelmanagementsystem.managerdepartment.ActionForW;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
public class customerdepartment extends JFrame {
	JLabel heading=new JLabel("CUSTOMER DEPARTMENT");
	JButton j1= new JButton("NEW CUSTOMER FORM");
	JButton j2= new JButton("CUSTOMER INFO");
	JButton j3= new JButton("CHECK OUT");
	JButton j4= new JButton("LOGOUT");
	JButton j5= new JButton("BACK");
	JLabel label = new JLabel();
	customerdepartment()
	{
		heading.setForeground(Color.white);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(50,60,600,100);
		add(heading);
		    j1.setBounds(170,200,200,50);
			j1.setBackground(Color.black);
			j1.setForeground(Color.white);
		//	j1.setFont(new Font("Serif",Font.ITALIC,18));
			add(j1);
			
			j2.setBounds(170,300,200,50);
			j2.setBackground(Color.black);
			j2.setForeground(Color.white);
			add(j2);
			

			j3.setBounds(170,400,200,50);
			j3.setBackground(Color.black);
			j3.setForeground(Color.white);
			add(j3);
			
			j4.setBounds(50,500,150,40);
			j4.setBackground(Color.black);
			j4.setForeground(Color.white);
			add(j4);
			
			j5.setBounds(300,500,150,40);
			j5.setBackground(Color.black);
			j5.setForeground(Color.white);
			add(j5);
			
			
			label.setIcon(new ImageIcon("Icon1/login70.jpg")); 
	        Dimension size = label.getPreferredSize(); 
	        label.setBounds(0,-190,1920,1020);
	        add(label);
			
			setLayout(null);
			getContentPane().setBackground(Color.white);
			setBounds(0,0,1920,1020);
			setVisible(true);
			j1.addActionListener(new ActionForZ ());
				j2.addActionListener(new ActionFors ());
			j3.addActionListener(new ActionForm ());
		    j4.addActionListener(new ActionForW ());
			j5.addActionListener(new ActionForB());
				
				
		}
	public static void main(String args[])
	{
		new customerdepartment();
	}
	class ActionForZ implements ActionListener
	{
	public void actionPerformed(ActionEvent c ) 
	{
		addcustomer a=new addcustomer();
	}
	}
	
	class ActionForW implements ActionListener
	{
	public void actionPerformed(ActionEvent c ) 
	{
		first a=new first();
	}
	}
	class ActionFors implements ActionListener
	{
	public void actionPerformed(ActionEvent c ) 
	{
		customerinfo a=new customerinfo();
	}
	}
	class ActionForm implements ActionListener
	{
	public void actionPerformed(ActionEvent c ) 
	{
		checkout a=new checkout();
	}
	}

	class ActionForB implements ActionListener
	{
	public void actionPerformed(ActionEvent c ) 
	{
	reception a=new reception ();
	}
	}
}
