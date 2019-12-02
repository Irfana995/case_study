package casestudy;
import java.util.Scanner;
public class case30main 
{
	private static Scanner ob;

	public static void main(String [] arg)
	{
	ob = new Scanner(System.in);
	String name,address,mob,mail,prooft,proofno;
	//person per[]=new person[20];
	registercustomer d[]=new registercustomer[20];
	int op;
	String op2;
	int i=0;
	int id=2001;
	do
	{
		System.out.println("1.Registration\n2.view customer\n3.Exit\n---->\n");
		op=ob.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter personal details");
			System.out.println("->Enter Name : ");
			ob.nextLine();
			name=ob.nextLine();
			System.out.println("->Enter Address : ");
			address=ob.nextLine();
			System.out.println("->Enter Mobile Number : ");
			mob=ob.nextLine();
			System.out.println("->Enter e-mail ID : ");
			mail=ob.nextLine();
			System.out.println("->Enter ID-Proof Type : ");
			prooft=ob.nextLine();
			System.out.println("->Enter ID-Proof Number : ");
			proofno=ob.nextLine();
			d[i]=new registercustomer();
			d[i].register(id,name,address,mob,mail,prooft);
			System.out.println("Thank you for Registering, Your id is :"+id);
			//d[i].display();
			id++;
			i++;
			break;
		case 2:
			System.out.println("           Customer List\n");
			System.out.println("Registered customers are\n");
			System.out.println("Customer ID\t\tCustomer name");
			for(int j=0;j<i;j++)
			{
				d[j].display();
				
			}
			break;
		case 3:
				System.exit(0);
		
		}
		System.out.println("Do you want to continue(Y/N||yes/no : ");
		op2=ob.next();
		}while(op2.equals("yes")||op2.equals("Yes")||op2.equals("YES"));

	}
}
