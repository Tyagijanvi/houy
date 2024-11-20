package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hotelmanagementsystem.adddrivers.ActionForB;
public class addrooms extends JFrame implements ActionListener {
	JLabel heading=new JLabel("ADD ROOMS");
	JLabel jb1=new JLabel("ROOM NUMBERS");
	JTextField txt1 = new JTextField(" ");
	
	JLabel jb2=new JLabel("AVAILABLE");
	String str[]= {"Available","Occupied"};
	JComboBox c1 = new JComboBox(str);
	
	JLabel jb3=new JLabel("ROOM STATUS");
	String str1[]= {"Cleaned","Dirty"};
	JComboBox c2 = new JComboBox(str1);
	
	JLabel jb4=new JLabel("ROOM PRICE");
	JTextField txt2 = new JTextField(" ");
	
	JLabel jb5=new JLabel("BED TYPE");
	String str2[]= {"Single-bed","Double-bed"};
	JComboBox c3 = new JComboBox(str2);
	
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	
	JButton j= new JButton("ADD");
	JButton j1= new JButton("BACK");
	database db =new database();
	addrooms()
	{
		heading.setForeground(Color.black);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(650,60,250,40);
		add(heading);
		
		//jb1.setFont(new Font("tahoma",Font.PLAIN, 15));
		jb1.setForeground(Color.white);
		jb1.setFont(new Font("Serif",Font.BOLD,20));
		jb1.setBounds(600,130,250,40);
		add(jb1);
		txt1.setBounds(800,140,150,20);
		txt1.setBackground(Color.black);
		txt1.setForeground(Color.white);
		add(txt1);
		
		//jb2.setFont(new Font("tahoma",Font.PLAIN, 15));
		jb2.setForeground(Color.white);
		jb2.setFont(new Font("Serif",Font.BOLD,20));
		jb2.setBounds(600,180,250,40);
		add(jb2);
		c1.setBounds(800,180,150,30);
		c1.setBackground(Color.black);
		c1.setForeground(Color.white);
		add(c1);
		
		//jb3.setFont(new Font("tahoma",Font.PLAIN, 15));
		jb3.setForeground(Color.white);
		jb3.setFont(new Font("Serif",Font.BOLD,20));
		jb3.setBounds(600,230,250,40);
		add(jb3);
		c2.setBounds(800,235,150,30);
		c2.setBackground(Color.black);
		c2.setForeground(Color.white);
		add(c2);
		
		//jb4.setFont(new Font("tahoma",Font.PLAIN, 15));
		jb4.setForeground(Color.white);
		jb4.setFont(new Font("Serif",Font.BOLD,20));
		jb4.setBounds(600,290,250,40);
		add(jb4);
		txt2.setBounds(800,300,150,20);
		txt2.setBackground(Color.black);
		txt2.setForeground(Color.white);
		add(txt2);
		
		//jb5.setFont(new Font("tahoma",Font.PLAIN, 15));
		jb5.setForeground(Color.white);
		jb5.setFont(new Font("Serif",Font.BOLD,20));
		jb5.setBounds(600,340,250,40);
		add(jb5);
		c3.setBounds(800,350,150,30);
		c3.setBackground(Color.black);
		c3.setForeground(Color.white);
		add(c3);
		
		j.setForeground(Color.white);
		j.setBackground(Color.black);
		j.setBounds(600,400,130,30);
		add(j);
		
		j1.setForeground(Color.white);
		j1.setBackground(Color.black);
		j1.setBounds(800,400,130,30);
		add(j1);
		
		label.setIcon(new ImageIcon("Icon1/login28.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(0,-10,1550,1020);
        add(label);
        
        //label1.setIcon(new ImageIcon("Icon10/login37.jpg")); 
       // Dimension size1 = label1.getPreferredSize(); 
       // label1.setBounds(70,60,1690,500);
       // add(label1);
        
        j.addActionListener(this);
		j1.addActionListener(new ActionForB());
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(0,0,1920,1020);
		setVisible(true);
	}
	public static void main(String[] args) {
        // TODO code application logic here
        new addrooms();
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==j)
		{
			String roomno= txt1.getText();
			String available = (String) c1.getSelectedItem();
			String status = (String) c2.getSelectedItem();
			String price= txt2.getText();
			String type = (String) c3.getSelectedItem();
			
			try {
				db.connect();
				int i=db.stmt.executeUpdate("insert into room values ('"+roomno+"','"+available+"','"+status+"','"+price+"','"+type+"')");
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
