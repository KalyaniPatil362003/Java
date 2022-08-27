package fibbo;
import java.util.Scanner;
class demo
{
 int n1,n2,n3,no,i;
 Scanner S=new Scanner(System.in);
 
 void get()
 {
	 n1=0;
	 n2=1;
	 
	 System.out.print("Enter Number:-");
	 no=S.nextInt();
	 
	 System.out.println("Fibbonaci Seris is:");
	 System.out.println(n1);
	 System.out.println(n2);
 }
 
 void put()
 {
	 for(i=2;i<=no;i++)
	 {
		 n3=n1+n2;
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
	 }
	 
 }
}
public class fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo d1=new demo();
d1.get();
d1.put();
	}

}
