package roombook;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class roombook {
	String ac,cot,cable,wifi,laundry;
	int a=0,b=0,c=0,d=0,e=0;
	void book(String ac,String cot,String cable,String wifi,String laundry)
	{
		System.out.print("The Services chosen are \n");
		float tot=0.0f;
		
		if(cot.contentEquals("Double"))
		{
			tot=tot+350;
			this.cot="Double cot";
		}
		else
			this.cot="Single cot";
		
		if(ac.contentEquals("AC"))
		{
			tot=1000;
			this.ac="AC Room";
		}
		else if(ac.contentEquals("nAC"))
		{
			tot=750;
			this.ac="Non-AC Room";
		}
		if(cable.contentEquals("C"))
		{
			tot=tot+50;
			this.cable="Cable Connection Enabled";
		}
		else
			this.cable="Cable Connection Disabled";
		if(wifi.contentEquals("W"))
		{
			tot=tot+200;
			this.wifi="WiFi Connection Enabled";
		}
		else
			this.wifi="WiFi Connection Disabled";
		if(laundry.contentEquals("C"))
		{
			tot=tot+100;
			this.laundry="With Laundry Service";
		}
		else
			this.laundry="With out Laundry Service";
		
		System.out.println("The total charge is Rs."+tot+"\n");	
		System.out.print(this.cot+" ");
		System.out.println(this.ac);
		System.out.println(this.cable);
		System.out.println(this.wifi);
		System.out.println(this.laundry);
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			private Scanner ob;

			public void run() {
				try {
					roombook window = new roombook();
					window.frame.setVisible(true);
					String op;
					String ac,cot,cable,wifi,laundry;
					ob = new Scanner(System.in);
					System.out.println("Booking:");
					do
					{
						System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
						ac=ob.next();
						System.out.println(".Cot(Enter Single/Double) :");
						cot=ob.next();
						System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
						cable=ob.next();
						System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
						wifi=ob.next();
						System.out.println(".Laundry service needed or not(Enter L/nL) :");
						laundry=ob.next();
						window.book(ac, cot, cable, wifi, laundry);
						System.out.println("Do you want to continue(Y/N||y/n : ");
						op=ob.next();
					}while(op.charAt(0)=='y'||op.charAt(0)=='Y');
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public roombook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}



