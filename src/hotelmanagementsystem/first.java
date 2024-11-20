package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class first extends JFrame implements ActionListener {
	first ()
    {
	JLabel label1 = new JLabel("Hotel Mangement System",JLabel.CENTER); 
	 label1.setForeground(Color.white);
    label1.setBounds(230,50,1100,120);
    //label1.setFont(new Font("ITALIC",Font.PLAIN,50));
    label1.setFont(new Font("Serif",Font.BOLD,100));
    JButton b1= new JButton("NEXT");
   b1.setForeground(Color.white);
   b1.setBackground(Color.black );
   b1.setBounds(700,600,150,40);
   b1.setFont(new Font("Serif",Font.ITALIC,20));
        JLabel label = new JLabel(); 
        
        label.setIcon(new ImageIcon("Icon1/login32.jpg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(50,200, 1920,1020);
        add(b1);
        add(label1);
        add(label);
        
        setSize(1366,565);
        setLocation(0,50);
        setBounds(0,0,1920,1020);
        setVisible(true);
        b1.addActionListener(this);
       
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new first();
    }
    public void actionPerformed(ActionEvent e)
	{
        new login();
    	dispose();
	}
    

}
