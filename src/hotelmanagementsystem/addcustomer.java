package hotelmanagementsystem;
import javax.swing.*;
import hotelmanagementsystem.addrooms.ActionForB;
import java.util.Date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class addcustomer extends JFrame implements ActionListener {
	JLabel heading = new JLabel("NEW CUSTOMER FORM");
	JLabel jl1 = new JLabel("ID");
	String str1[]= {"Adhar card","passport","driving license","voter-id card","ration card"};
	JComboBox c1 = new JComboBox(str1);
	
	JLabel jl2 = new JLabel("NUMBER");
	JTextField txt = new JTextField(" ");
	
	JLabel jl3 = new JLabel("NAME");
	JTextField txt2 = new JTextField(" ");
	
	JLabel jl4= new JLabel("GENDER");
	JRadioButton rb = new JRadioButton("MALE");
	JRadioButton rb1 = new JRadioButton("FEMALE");
	ButtonGroup bg = new ButtonGroup();
	
	JLabel jl5 = new JLabel("COUNTRY");
	JTextField txt3 = new JTextField(" ");
	
	JLabel jl6 = new JLabel("ROOM NUMBER");
	Choice c;
	database db =new database();
	
	JLabel jl7 = new JLabel("CHECK-IN-TIME");
	//JTextField txt5 = new JTextField(" ");
	Date date= new Date();
	JLabel jl8 = new JLabel(" "+date);
	

	JLabel jl9 = new JLabel("DEPOIST");
	JTextField txt4 = new JTextField(" ");
	
	JLabel label=new JLabel();
	
	JButton j1=new JButton("ADD");
	JButton j2=new JButton("BACK");
	addcustomer()
	{
		//heading.setBounds(100,20,300,30);
		//heading.setFont(new Font("Railway",Font.PLAIN,20));
		//add(heading);
		heading.setForeground(Color.white);
		heading.setFont(new Font("tahoma",Font.BOLD, 40));
		heading.setFont(new Font("Serif",Font.BOLD,40));
		heading.setBounds(600,60,500,40);
		add(heading);
		
		jl1.setForeground(Color.white);
		jl1.setFont(new Font("Serif",Font.BOLD,20));
		jl1.setBounds(600,130,250,40);
		add(jl1);
		
		c1.setBounds(800,135,150,30);
		c1.setBackground(Color.black);
		c1.setForeground(Color.white);
		//c1.setBounds(200,80,150,25);
	//	c1.setBackground(Color.white);
		add(c1);
		
		jl2.setForeground(Color.white);
		jl2.setFont(new Font("Serif",Font.BOLD,20));
		jl2.setBounds(600,170,250,40);
		add(jl2);
		txt.setBounds(800,175,150,30);
		txt.setBackground(Color.black);
		txt.setForeground(Color.white);
		add(txt);
		
		jl3.setForeground(Color.white);
		jl3.setFont(new Font("Serif",Font.BOLD,20));
		jl3.setBounds(600,210,250,40);
		add(jl3);
		
		txt2.setBounds(800,215,150,30);
		txt2.setBackground(Color.black);
		txt2.setForeground(Color.white);
		add(txt2);
		
		jl4.setForeground(Color.white);
		jl4.setFont(new Font("Serif",Font.BOLD,20));
		jl4.setBounds(600,250,250,40);
		add(jl4);
		
		rb.setBounds(800,255,90,30);
		rb.setBackground(Color.black);
		rb.setForeground(Color.white);
		add(rb);
		
		rb1.setBounds(900,255,90,30);
		rb1.setBackground(Color.black);
		rb1.setForeground(Color.white);
		add(rb1);
		
		bg.add(rb);
		bg.add(rb1);
		
		jl5.setForeground(Color.white);
		jl5.setFont(new Font("Serif",Font.BOLD,20));
		jl5.setBounds(600,290,250,40);
		add(jl5);
		
		txt3.setBounds(800,295,150,30);
		txt3.setBackground(Color.black);
		txt3.setForeground(Color.white);
		add(txt3);
		
		jl6.setForeground(Color.white);
		jl6.setFont(new Font("Serif",Font.BOLD,20));
		jl6.setBounds(600,330,250,40);
		add(jl6);
		c= new Choice();
		try {
			db.connect();
			String s= "select * from room where available='Available'";
			
			db.rst=db.stmt.executeQuery(s);
			while(db.rst.next())
			{
				c.add(db.rst.getString("roomno"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		c.setBounds(800,335,150,40);
		//c.setBounds(1000,335,200,30);
		c.setBackground(Color.black);
		c.setForeground(Color.white);
		add(c);
		
		jl7.setForeground(Color.white);
		jl7.setFont(new Font("Serif",Font.BOLD,20));
		jl7.setBounds(600,370,250,40);
		add(jl7);
	//txt5.setBounds(800,375,150,30);
	  // txt5.setBackground(Color.black);
		//txt5.setForeground(Color.white);
		//add(txt5);
		
		jl8.setForeground(Color.white);
		jl8.setFont(new Font("Serif",Font.BOLD,20));
		jl8.setBounds(800,375,300,40);
		add(jl8);
		
		jl9.setForeground(Color.white);
		jl9.setFont(new Font("Serif",Font.BOLD,20));
		jl9.setBounds(600,450,250,40);
		add(jl9);
		txt4.setBounds(200,360,150,25);
		txt4.setBounds(800,455,150,30);
		txt4.setBackground(Color.black);
		txt4.setForeground(Color.white);
	    add(txt4);
		
		j1.setBounds(600,530,120,30);
		j1.setBackground(Color.black);
		j1.setForeground(Color.white);
		add(j1);
		j2.setBounds(800,530,120,30);
		j2.setBackground(Color.black);
		j2.setForeground(Color.white);
		add(j2);
		
		label.setIcon(new ImageIcon("Icon1/login77.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(-300, 0,1920,1020);
        add(label);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(0,0,1920,1020);
		setVisible(true);
		j1.addActionListener(this);
		j2.addActionListener(new ActionForB());
	}
public static void main(String[]args)
{
	new addcustomer();
}
public void actionPerformed(ActionEvent e)
{
	String id = (String) c1.getSelectedItem();
	String number= txt.getText();
	String name = txt2.getText();
	String country= txt3.getText();
	String room= c.getSelectedItem();
	String depoist = txt4.getText();
	String checkintime = jl8.getText();
	String gender = null;
	if(rb.isSelected())
	{
		gender="Male";
	}
	else if(rb1.isSelected()) {
		gender="FEMALE";
	}
	String job= (String) c1.getSelectedItem();
	try {
	db.connect();
	int i=db.stmt.executeUpdate("insert into customer values ('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+depoist+"','"+checkintime+"')");
	if(i>0)
	{
		db.stmt.executeUpdate("update room set available='occupied' where roomno='"+room+"'");
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
class ActionForB implements ActionListener
{
public void actionPerformed(ActionEvent o) {
customerdepartment i=new customerdepartment();
}
}

}
