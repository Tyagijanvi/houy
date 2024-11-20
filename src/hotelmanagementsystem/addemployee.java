package hotelmanagementsystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import hotelmanagementsystem.addrooms.ActionForB;
public class addemployee extends JFrame implements ActionListener {
	JLabel heading=new JLabel("ADD EMPLOYEES");
	JLabel lb1= new JLabel("NAME");
	JTextField txt = new JTextField(" "); 

	JLabel lb2= new JLabel("AGE");
	JTextField txt1 = new JTextField(" "); 

	JLabel lb3= new JLabel("GENDER");
	JRadioButton rb = new JRadioButton("MALE");
	JRadioButton rb1 = new JRadioButton("FEMALE");

	ButtonGroup bg = new ButtonGroup();

	JLabel lb4= new JLabel("JOB");

	String str[]= {"Front Desk Clerk","porters","housekeeping","kitchen staff","room services","chefs","waiters","manger","accountant"};
	JComboBox c1 = new JComboBox(str);

	JLabel lb5= new JLabel("SALARY");
	JTextField txt2 = new JTextField(" "); 

	JLabel lb6= new JLabel("PHONE");
	JTextField txt3 = new JTextField(" "); 

	JLabel lb7= new JLabel("EMAIL");
	JTextField txt4 = new JTextField(" "); 

	JLabel lb8= new JLabel("ADHAR");
	JTextField txt5 = new JTextField(" "); 

	JButton jb= new JButton("Submit");
	JLabel label = new JLabel();

	JButton jb1= new JButton("BACK");
	JLabel label1 = new JLabel();

	database db = new database();
		addemployee()
		{
			heading.setForeground(Color.black);
			heading.setFont(new Font("tahoma",Font.BOLD, 40));
			heading.setFont(new Font("Serif",Font.BOLD,40));
			heading.setBounds(200,60,500,40);
			add(heading);
			
			//lb1.setBounds(60,30,120,30);
			//lb1.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb1.setForeground(Color.white);
			lb1.setFont(new Font("Serif",Font.BOLD,20));
			lb1.setBounds(200,130,250,40);
			add(lb1);
			
			txt.setBounds(300,135,150,30);
			txt.setBackground(Color.black);
			txt.setForeground(Color.white);
			add(txt);
			
			//lb2.setBounds(60,80,120,30);
			//lb2.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb2.setForeground(Color.white);
			lb2.setFont(new Font("Serif",Font.BOLD,20));
			lb2.setBounds(200,170,250,40);
			add(lb2);
			
			//txt1.setBounds(200,80,150,30);
			txt1.setBounds(300,175,150,30);
			txt1.setBackground(Color.black);
			txt1.setForeground(Color.white);
			add(txt1);
			
		//	lb3.setBounds(60,130,120,30);
			//lb3.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb3.setForeground(Color.white);
			lb3.setFont(new Font("Serif",Font.BOLD,20));
			lb3.setBounds(200,210,250,40);
			add(lb3);
			
			rb.setBounds(300,215,70,30);
			rb.setBackground(Color.black);
			rb.setForeground(Color.white);
			//rb.setFont(new Font("tahoma",Font.PLAIN, 14));
			//rb.setBackground(Color.white);
			add(rb);
			
			rb1.setBounds(380,215,80,30);
			rb1.setBackground(Color.black);
			rb1.setForeground(Color.white);
			//rb1.setFont(new Font("tahoma",Font.PLAIN, 14));
			//rb1.setBackground(Color.white);
			add(rb1);
			
			bg.add(rb);
			bg.add(rb1);
			
		//	lb4.setBounds(60,180,120,30);
			//lb4.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb4.setForeground(Color.white);
			lb4.setFont(new Font("Serif",Font.BOLD,20));
			lb4.setBounds(200,250,250,40);
			add(lb4);
			
			c1.setBounds(300,255,150,30);
			c1.setBackground(Color.black);
			c1.setForeground(Color.white);
			//c1.setBackground(Color.white);
			add(c1);
			
		//	lb5.setBounds(60,230,120,30);
			//lb5.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb5.setForeground(Color.white);
			lb5.setFont(new Font("Serif",Font.BOLD,20));
			lb5.setBounds(200,290,250,40);
			add(lb5);
			
			txt2.setBounds(300,295,150,30);
			txt2.setBackground(Color.black);
			txt2.setForeground(Color.white);
			add(txt2);
			
		//	lb6.setBounds(60,280,120,30);
			//lb6.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb6.setForeground(Color.white);
			lb6.setFont(new Font("Serif",Font.BOLD,20));
			lb6.setBounds(200,330,250,40);
			add(lb6);
			
			txt3.setBounds(300,335,150,30);
			txt3.setBackground(Color.black);
			txt3.setForeground(Color.white);
			add(txt3);
			
		//	lb7.setBounds(60,330,120,30);
			//lb7.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb7.setForeground(Color.white);
			lb7.setFont(new Font("Serif",Font.BOLD,20));
			lb7.setBounds(200,370,250,40);
			add(lb7);
			
			txt4.setBounds(300,375,150,30);
			txt4.setBackground(Color.black);
			txt4.setForeground(Color.white);
			add(txt4);
			
		//	lb8.setBounds(60,380,120,30);
			//lb8.setFont(new Font("tahoma",Font.PLAIN, 17));
			lb8.setForeground(Color.white);
			lb8.setFont(new Font("Serif",Font.BOLD,20));
			lb8.setBounds(200,410,250,40);
			add(lb8);
			
			txt5.setBounds(300,415,150,30);
			txt5.setBackground(Color.black);
			txt5.setForeground(Color.white);
			add(txt5);
			
			jb.setBackground(Color.black);
			jb.setForeground(Color.white);
			jb.setBounds(200,500,100,30);
			add(jb);
			
			jb1.setBackground(Color.black);
			jb1.setForeground(Color.white);
			jb1.setBounds(350,500,100,30);
			add(jb1);
	        
	        label.setIcon(new ImageIcon("Icon1/login74.jpg")); 
	        Dimension size = label.getPreferredSize(); 
	        label.setBounds(0,0,1900,1000);
	        
	        jb.addActionListener(this);
	        jb1. addActionListener(new ActionForB());
	        add(label);
			setLayout(null);
			setVisible(true);
			setBounds(0,0,1920,1020);
			getContentPane().setBackground(Color.white);
		}
		
		public static void main(String[] args) {
	        // TODO code application logic here
	        new addemployee();
	    }
		public void actionPerformed(ActionEvent e)
		{
			String name = txt.getText();
			String age= txt1.getText();
			String salary = txt2.getText();
			String phone = txt3.getText();
			String email = txt4.getText();
			String adhar = txt5.getText();
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
			int i=db.stmt.executeUpdate("insert into employee1 values ('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+adhar+"')");
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
		 class ActionForB implements ActionListener
		 {
		 public void actionPerformed(ActionEvent o) {
		 dashboard i=new dashboard();
		 }
		 }

}
