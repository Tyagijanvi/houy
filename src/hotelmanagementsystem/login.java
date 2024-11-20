package hotelmanagementsystem;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
public class login extends JFrame implements ActionListener{
	JLabel heading=new JLabel("LOGIN PAGE");
	database db= new database();
	JTextField txt = new JTextField("");
	JPasswordField txt1 = new JPasswordField("");
 login()
{
	    heading.setForeground(Color.white);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(600,280,600,100);
		add(heading);
	 getContentPane().setBackground(Color.white);
	 setLayout(null);
	 JLabel user= new JLabel("USERNAME");
	 user.setBounds(580,420,180,20);
	 user.setFont(new Font("Serif",Font.ITALIC,20));
	// user.setForeground(Color.white);
	 user.setForeground(Color.white);
	// user.setBackground(Color.white);
     add(user);
     
	 txt.setBounds(700,420,150,20);
	 txt.setBackground(Color.black);
	 txt.setForeground(Color.white);
	 add(txt);
	 JLabel pass= new JLabel("PASSWORD");
	 pass.setBounds(580,470,180,20);
	 pass.setFont(new Font("Serif",Font.ITALIC,20));
	 pass.setForeground(Color.white);
   // pass.setBackground(Color.white);
     add(pass);
     
	 txt1.setBounds(700,470,150,20);
	 txt1.setBackground(Color.black);
	 txt1.setForeground(Color.white);
	 add(txt1);
	 
	 JButton jb= new JButton("Login");
	 jb.setBounds(600,520,100,40);
	 jb.setFont(new Font("Serif",Font.BOLD,15));
	 add(jb);
	 jb.setBackground(Color.black);
	 jb.setForeground(Color.white);
	 
	 JButton jb1= new JButton("BACK");
	 jb1.setBounds(750,520,100,40);
	 jb1.setFont(new Font("Serif",Font.BOLD,15));
	 add(jb1);
	 jb1.setBackground(Color.black);
	 jb1.setForeground(Color.white);
	 JLabel label = new JLabel(); 
     label.setIcon(new ImageIcon("Icon1/login45.jpg")); 
     //Dimension size = label.getPreferredSize(); 
     label.setBounds(0,-90,1920,900);
     add(label);
	setBounds(0,0,1920,1020);
	setVisible(true);
	
	 jb.addActionListener(this);
	 jb1.addActionListener(new ActionForB());
}
	
	
	 public static void main(String[] args) {
	        // TODO code application logic here
	        new login();
	    }
	 public void actionPerformed(ActionEvent e)
		{
		 int i=0;
		 db.connect();
			String nm=txt.getText();
			String ps=txt1.getText();
			try {
				while(db.rst.next())
				{
					if(nm.compareTo(db.rst.getString("username"))==0 && ps.compareTo(db.rst.getString("password"))==0)

					{//JOptionPane.showMessageDialog(null,"login successful");
					    new dashboard();
						i=1;
					break;
					}
				}
				
				if(i==0)
				{
				JOptionPane.showMessageDialog(null,"wrong");
				}
		}
			catch(SQLException sqe)
			{
				System.out.print(sqe);
			}
		} 
	 class ActionForB implements ActionListener
	 {
	 public void actionPerformed(ActionEvent o) {
	 first i=new first();
	 dispose();
	 }
	 }
}
