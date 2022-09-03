package multilevelinheritance;

import java.util.*;
class demo
{
 int i,no;
 Scanner Sc=new Scanner(System.in);
 void read()
 {
	 System.out.println("Enter No:-");
	 no=Sc.nextInt();
	 
 }
}
class demo1 extends demo
{
void disp()
{
	System.out.println("----------------Table Of"+" "+no+" "+"Is----------------");

}
}
class demo3 extends demo1
{
void put()
{
	for(i=1;i<=10;i++)
	  {
		  System.out.println(i*no);
	  }
	System.out.println("--------------------------------------------------------------");	
}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 D=new demo3();
		D.read();
		D.disp();
		D.put();
	}

}
