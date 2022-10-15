package prime;
import java.util.Scanner;
class demo
{
 void put()
 {
	int num,i,count=0;
			Scanner s=new Scanner(System.in);
	System.out.println("Enter number:-");
	num=s.nextInt();
	
	for(i=2;i<num;i++)
	{
		
		if(num%i==0)
		{
			
			count++;
			break;
		}
	}
	 if(count==0)

	System.out.println("Number is prime");
	 else
	 
		 System.out.println("Number is Not prime");
 }
 
}
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo D=new demo();
     D.put();
	}

}
