import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class DemoCalculator extends JFrame implements ActionListener

{
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	JLabel l1,l2;
	JTextField t1,t2,t3;
	int c;

	DemoCalculator(){
	
		
		l1 = new JLabel("1st Number : ");
		l1.setBounds(100,50,150,30);
		add(l1);
	
		t1= new JTextField("");
		t1.setBounds(200,50,80,30);
		add(t1);

		l2 = new JLabel("2nd Number : ");
		l2.setBounds(300,50,150,30);
		add(l2);
		
		t2 = new JTextField();
		t2.setBounds(400,50,80,30);
		add(t2);
		
		t3 = new JTextField();
		t3.setBounds(250,100,150,30);
		add(t3);

		b7 = new JButton(" 7 ");
		b7.setBounds(200,200,50,50);
		add(b7);
		b7.addActionListener(this);

		b8 = new JButton(" 8 ");
		b8.setBounds(260,200,50,50);
		add(b8);
		b8.addActionListener(this);

		b9 = new JButton(" 9 ");
		b9.setBounds(320,200,50,50);
		add(b9);
		b9.addActionListener(this);

		b4 = new JButton(" 4 ");
		b4.setBounds(200,260,50,50);
		add(b4);
		b4.addActionListener(this);
	
		b5 = new JButton(" 5 ");
		b5.setBounds(260,260,50,50);
		add(b5);
		b5.addActionListener(this);

		b6 = new JButton(" 6 ");
		b6.setBounds(320,260,50,50);
		add(b6);
		b6.addActionListener(this);

		b1 = new JButton("1");
		b1.setBounds(200,320,50,50);
		add(b1);
		b1.addActionListener(this);
	
		b2 = new JButton(" 2 ");
		b2.setBounds(260,320,50,50);
		add(b2);
		b2.addActionListener(this);
	
		b3 = new JButton(" 3 ");
		b3.setBounds(320,320,50,50);
		add(b3);
		b3.addActionListener(this);
/*
		b10 = new JButton(" % ");
		b10.setBounds(200,380,50,50);
		add(b10);
		b10.addActionListener(this);
*/
		b11 = new JButton(" 0 ");
		b11.setBounds(200,380,110,50);
		add(b11);
		b11.addActionListener(this);

		b12 = new JButton(" . ");
		b12.setBounds(320,380,50,50);
		add(b12);
		b12.addActionListener(this);

		b13 = new JButton(" * ");
		b13.setBounds(380,200,50,50);
		add(b13);
		b13.addActionListener(this);

		b14 = new JButton(" - ");
		b14.setBounds(380,260,50,50);
		add(b14);
		b14.addActionListener(this);

		b15 = new JButton(" + ");
		b15.setBounds(380,320,50,50);
		add(b15);
		b15.addActionListener(this);

		b16 = new JButton(" = ");
		b16.setBounds(380,380,50,50);
		add(b16);
		b16.addActionListener(this);

		b17 = new JButton(" C ");
		b17.setBounds(200,140,50,50);
		add(b17);
		b17.addActionListener(this);
/*
		b18 = new JButton(" % ");
		b18.setBounds(260,140,50,50);
		add(b18);
		b18.addActionListener(this);
*/
		b19 = new JButton("Backspace");
		b19.setBounds(260,140,110,50);
		add(b19);
		b19.addActionListener(this);

		b20 = new JButton(" / ");
		b20.setBounds(380,140,50,50);
		add(b20);
		b20.addActionListener(this);

		setLayout(null);
		setTitle(" Calculator ");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
	
		
		int d;
		
		if(t1.getText().isEmpty())
		{	
			
			if(e.getSource()== b1)
			{
				d=1;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b2)
			{
				d=2;
				t1.setText(String.valueOf(d));
			
			
			}
			if(e.getSource()== b3)
			{
				d=3;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b4)
			{
				d=4;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b5)
			{
				d=5;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b6)
			{
				d=6;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b7)
			{
				d=7;
				t1.setText(String.valueOf(d));
			
			
			}


			if(e.getSource()== b8)
			{
				d=8;
				t1.setText(String.valueOf(d));
			
			
			}


			if(e.getSource()== b9)
			{
				d=9;
				t1.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b11)
			{
				d=0;
				t1.setText(String.valueOf(d));
			
			
			}
		
		}

		else{
			

			if(e.getSource()== b1)
			{
				d=1;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b2)
			{
				d=2;
				t2.setText(String.valueOf(d));
			
			
			}
			if(e.getSource()== b3)
			{
				d=3;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b4)
			{
				d=4;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b5)
			{
				d=5;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b6)
			{
				d=6;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b7)
			{
				d=7;
				t2.setText(String.valueOf(d));
			
			
			}


			if(e.getSource()== b8)
			{
				d=8;
				t2.setText(String.valueOf(d));
			
			
			}


			if(e.getSource()== b9)
			{
				d=9;
				t2.setText(String.valueOf(d));
			
			
			}

			if(e.getSource()== b11)
			{
				d=0;
				t2.setText(String.valueOf(d));
			
			
			}

			
		
		}


		try{
		
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());

		if(e.getSource()==b15)
			c =b+a;
		if(e.getSource()==b14)
			c =a-b;
		if(e.getSource()==b13)
			c=a*b;
		if(e.getSource()==b20)
			c=a/b;
		
		System.out.println("Calculator is working");

		if(e.getSource()==b16){
			
			t3.setText(String.valueOf(c));	
			System.out.println("\n");
			System.out.println("Finished Sucessfully");
			System.out.println("Restart to use again");
	
	
		}

		}catch(NumberFormatException nfe){}	

	}

	public static void main(String args []){

		DemoCalculator ob = new DemoCalculator();

		
	

	}

}