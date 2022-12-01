import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LoginPage extends JFrame
{

	JButton b1 ;
	JLabel  l1,l2,l3,l4,l5,l6 ;
	JTextField t1,t2,t3;
	JCheckBox c1;
	JPasswordField p1;
	
	LoginPage(){
	
		l1 = new JLabel("Login");
		l1.setBounds(200,70,150,80);
		l1.setFont(new Font("Calibri", Font.BOLD, 35));
		add(l1);

		l2 = new JLabel("Username");
		l2.setBounds(145,140,100,40);
		l2.setFont(new Font("Calibart",Font.BOLD,12));
		add(l2);

		l3 = new JLabel("Password");
		l3.setBounds(145,220,100,40);
		l3.setFont(new Font("Calibart",Font.BOLD,12));
		add(l3);

		t1 = new JTextField("  Enter Your Username...");
		t1.setBounds(145,180,200,40);
		add(t1);

		p1 = new JPasswordField();
		p1.setText("  Enter Your Password...");
		p1.setBounds(145,260,200,40);
		add(p1);

		c1 = new JCheckBox("Remember me");
		c1.setBounds(145,300,130,30);
		add(c1);

		b1 = new JButton("LOGIN");
		b1.setBounds(145,340,200,40);
		add(b1);

		l4 = new JLabel("Forget Password?");
		l4.setBounds(250,380,200,30);
		l4.setFont(new Font("Calibart",Font.BOLD,10));
		add(l4);


		l5 = new JLabel("Or Sign Up Using");
		l5.setBounds(190,420,200,30);
		l5.setFont(new Font("Calibart",Font.BOLD,12));
		add(l5);

		ImageIcon img = new ImageIcon("google.PNG");
		l6 = new JLabel(img);
		l6.setBounds(190,500,200,100);
		add(l6);
		

		setLayout(null);
		setTitle("Login Page");
		setSize(500,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}



	public static void main(String args []){

		LoginPage ob = new LoginPage();	
	

	}


}