package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hotelmanagementsystem.login.ActionForB;
public class adddrivers extends JFrame implements ActionListener{
	JLabel heading=new JLabel("ADD DRIVERS");
	JLabel jb1=new JLabel("NAME");
	JTextField txt1 = new JTextField(" ");
	
	JLabel jb2=new JLabel("AGE");
	JTextField txt2 = new JTextField(" ");
	
	JLabel jb3=new JLabel("GENDER");
	String str1[]= {"MALE","FEMALE"};
	JComboBox c2 = new JComboBox(str1);
	
	JLabel jb4=new JLabel("Car Company");
	JTextField txt4 = new JTextField(" ");
	
	JLabel jb5=new JLabel("Car Model");
	JTextField txt5 = new JTextField(" ");
	
	JLabel label = new JLabel(); 
	
	JLabel jb6=new JLabel("GENDER");
	String str2[]= {"Available","BUSY"};
	JComboBox c3 = new JComboBox(str2);
	
	JLabel jb7=new JLabel("LOACTION");
	JTextField txt7= new JTextField(" ");
	
	JButton j= new JButton("ADD");
	JButton j1= new JButton("BACK");
	database db =new database();
	adddrivers()
	{
		heading.setForeground(Color.black);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(1080,60,500,40);
		add(heading);
		
		jb1.setForeground(Color.black);
		jb1.setFont(new Font("Serif",Font.BOLD,20));
		jb1.setBounds(1080,130,250,40);
		add(jb1);
		txt1.setBounds(1230,135,150,30);
		txt1.setBackground(Color.black);
		txt1.setForeground(Color.white);
		add(txt1);
		
		jb2.setForeground(Color.black);
		jb2.setFont(new Font("Serif",Font.BOLD,20));
		jb2.setBounds(1080,170,250,40);
		add(jb2);
		txt2.setBounds(1230,175,150,30);
		txt2.setBackground(Color.black);
		txt2.setForeground(Color.white);
		add(txt2);
		
		jb3.setForeground(Color.black);
		jb3.setFont(new Font("Serif",Font.BOLD,20));
		jb3.setBounds(1080,210,250,40);
		add(jb3);
		
		c2.setBounds(1230,215,150,30);
		c2.setBackground(Color.black);
		c2.setForeground(Color.white);
		add(c2);
		
		jb4.setForeground(Color.white);
		jb4.setFont(new Font("Serif",Font.BOLD,20));
		jb4.setBounds(1080,250,250,40);
		add(jb4);
		
		txt4.setBounds(1230,255,150,30);
		txt4.setBackground(Color.black);
		txt4.setForeground(Color.white);
		add(txt4);
		
		jb5.setForeground(Color.white);
		jb5.setFont(new Font("Serif",Font.BOLD,20));
		jb5.setBounds(1080,290,250,40);
		add(jb5);
	
		txt5.setBounds(1230,295,150,30);
		txt5.setBackground(Color.black);
		txt5.setForeground(Color.white);
		add(txt5);
		
		jb6.setForeground(Color.white);
		jb6.setFont(new Font("Serif",Font.BOLD,20));
		jb6.setBounds(1080,330,250,40);
		add(jb6);
		
		c3.setBounds(1230,335,150,30);
		c3.setBackground(Color.black);
		c3.setForeground(Color.white);
		add(c3);
		
		jb7.setForeground(Color.white);
		jb7.setFont(new Font("Serif",Font.BOLD,20));
		jb7.setBounds(1080,370,250,40);
		add(jb7);
		
		txt7.setBounds(1230,375,150,30);
		txt7.setBackground(Color.black);
		txt7.setForeground(Color.white);
		add(txt7);
		
		j.setForeground(Color.white);
		j.setBackground(Color.black);
		j.setBounds(1080,425,120,30);
		add(j);
		
		j1.setForeground(Color.white);
		j1.setBackground(Color.black);
		j1.setBounds(1260,425,120,30);
		add(j1);
		
		label.setIcon(new ImageIcon("icon/login76.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(-60,0,1600,800);
        add(label);
        
        j.addActionListener(this);
		j1.addActionListener(new ActionForB());
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(0,0,1920,1020);
		setVisible(true);
	}
	public static void main(String[] args) {
        // TODO code application logic here
        new adddrivers();
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==j)
		{
			String name= txt1.getText();
			String age = txt2.getText();
			String status = (String) c2.getSelectedItem();
			String carcompany= txt4.getText();
			String carmodel= txt5.getText();
			String avialable = (String) c3.getSelectedItem();
			String location= txt7.getText();
			
			try {
				db.connect();
				int i=db.stmt.executeUpdate("insert into drivers values ('"+name+"','"+age+"','"+status+"','"+carcompany+"','"+carmodel+"','"+avialable+"','"+location+"')");
				if(i>0)
				{
					JOptionPane.showMessageDialog(null, "succesfully inserted");	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Something is missing");	
				}
				}
				catch(Exception c){
					c.printStackTrace();
				}
				}
		else
		{
			setVisible(false);
		}
		}
	 class ActionForB implements ActionListener
	 {
	 public void actionPerformed(ActionEvent o) {
	 dashboard i=new dashboard();
	 }
	 }

}
