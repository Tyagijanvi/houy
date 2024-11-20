package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import hotelmanagementsystem.login.ActionForB;
import hotelmanagementsystem.managerdepartment.ActionForW;
public class dashboard extends JFrame implements ActionListener {
	dashboard()
	{
	    JButton jb= new JButton("Logout");
	   	 jb.setBounds(500,320,150,40);
	   	 jb.setFont(new Font("Serif",Font.BOLD,15));
	   	 add(jb);
	   	 jb.setBackground(Color.black);
	   	 jb.setForeground(Color.white);
	   	 
	   	 JButton jb1= new JButton("BACK");
	   	 jb1.setBounds(750,320,150,40);
	   	 jb1.setFont(new Font("Serif",Font.BOLD,15));
	   	 add(jb1);
	   	 jb1.setBackground(Color.black);
	   	 jb1.setForeground(Color.white);
		
		JLabel label = new JLabel(); 
        label.setIcon(new ImageIcon("Icon1/login25.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(50,40, size.width, size.height);
        
        JLabel l1 = new JLabel("THE TAJ GROUP WELCOMES YOU!"); 
        l1.setBounds(400,100,1000,50);
        l1.setFont(new Font("Serif",Font.BOLD,46));
        //l1.setFont(new Font("Tohoma",Font.PLAIN,46));
        l1.setForeground(Color.white);
        JMenuBar mb= new JMenuBar();
        mb.setBounds(0,0,1550,30);
        JMenu hotel = new JMenu("HOTEL MANGEMENT");
        hotel.setForeground(Color.red);
        JMenuItem reception = new  JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        JMenu admin = new JMenu("ADMIN");
        JMenuItem addemployes = new  JMenuItem("ADD EMPLOYES");
       
        admin.setForeground(Color.blue);
       
        addemployes.addActionListener(this);
        admin.add(addemployes);
       
        JMenuItem addrooms = new  JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        JMenuItem adddrivers = new  JMenuItem("ADD DRIVERS");
        adddrivers.addActionListener(this);
        admin.add(adddrivers);
        mb.add(hotel);
        mb.add(admin);
        add(mb);
        add(l1);
        add(label);
        
    
   
        setBounds(0,0,1920,1020);
		setVisible(true);
		 jb.addActionListener(new ActionForX());
		 jb1.addActionListener(new ActionForB());
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	  if(ae.getActionCommand().equals("ADD EMPLOYES"))
	  {
		  new addemployee();
	  }
	  else if(ae.getActionCommand().equals("ADD ROOMS")){
		  new addrooms();	
	  }
	  else if(ae.getActionCommand().equals("ADD DRIVERS"))
	  {
		  new adddrivers();
	  }
	  
	  else if(ae.getActionCommand().equals("RECEPTION")){
		  new reception();
	  }
	  }
	
	
public static void main(String[] args) {
        // TODO code application logic here
        new dashboard();
    }

class ActionForX implements ActionListener
{
public void actionPerformed(ActionEvent o) {
first i=new first();
}
}
class ActionForB implements ActionListener
{
public void actionPerformed(ActionEvent o) {
login i=new login();
dispose();
}
}

}
