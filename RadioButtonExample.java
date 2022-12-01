import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample extends JFrame 

{
	
	JRadioButton rb1,rb2,rb3,Button;

	RadioButtonExample(){
		
		 boolean visible = true;
		
		
		Button = new JRadioButton() ; 


		rb1 = new JRadioButton("Easy");
		
		
		rb2 = new JRadioButton("Medium");
		
		
		rb3 = new JRadioButton("Hard");
	
		ButtonGroup g = new ButtonGroup();
	
		
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);
		

		
		add(rb1);
		add(rb2);
		add(rb3);		
		setTitle("Radio Button");
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


	}
	

	public static void main(String args []){

		RadioButtonExample ob = new RadioButtonExample();		

	}

}