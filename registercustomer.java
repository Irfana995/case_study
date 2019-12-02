package casestudy;

import java.util.Scanner;



	public class registercustomer {
			int id;
			String name,address,mob,pt,pno;
			public void register(int id,String name,String address,String mob,String pt,String pno)
			{
				Scanner S=new Scanner(System.in);
				String op,op2;
				this.id=id;
				this.name=name;
				this.address=address;
				this.mob=mob;
				this.pt=pt;
				this.pno=pno;
			}
			void display()
			{
				System.out.println(id+"\t\t\t"+name);
			}
	}




