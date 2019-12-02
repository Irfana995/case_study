package casestudy;
import java.util.Scanner;
public class personinfo 
{
	private static Scanner ob;

	public static void main(String [] arg)
	{
	ob = new Scanner(System.in);
	String name,address,mob,mail,prooft,proofno;
	person per[]=new person[20];
	int op;
	String op2;
	int i=0;
	int id=2001;
	do
	{
		System.out.println("PERSONAL INFORMATION\n1.Registration\n2.Update your Mail\n3.Exit\n---->\n");
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
			per[i]=new person();
			per[i].register(id,name,address,mob,mail,prooft,proofno);
			System.out.println("Thank you for Registering, Your id is :"+id);
			per[i].display();
			id++;
			i++;
			break;
		case 2:
			System.out.println("Enter your Registration ID: ");
			int iid=ob.nextInt();
			int k=0;
			for(int j=0;j<i;j++)
			{
				if(per[j].id==iid)
				{
				System.out.println("Enter your New e-mail ID: ");
				ob.nextLine();
				mail=ob.nextLine();
				per[j].updatemail(mail);
				k=1;
				per[j].display();
				break;
				}
			}
		    if(k==0)
			{
				System.out.println("Invalid  Registration ID");
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
