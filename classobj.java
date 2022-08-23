package classobj;
import java.util.Scanner;
class demo
{
 	int a;
 	void get()
 	{
 		System.out.println("Enter Value Of A:");
 		Scanner S=new Scanner(System.in);
 		a=S.nextInt();
 		
 	}
 	void put()
 	{
 		System.out.println("Value Of A:"+a);
 		
 	}
}
public class classobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo D=new demo();
    		 D.get();
             D.put();
	}

}
