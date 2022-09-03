package multipleinhe;
import java.util.Scanner;

interface demo
{
void get();	
}

class demo1
{
int a,b;
Scanner Sc=new Scanner(System.in);

void put()
{

System.out.println("Enter value Of A:-");
a=Sc.nextInt();


System.out.println("Enter value Of B:-");
b=Sc.nextInt();

}
}
class demo3  extends demo1 implements demo
{
	public void get()
	{
		System.out.println("Multiplication Is:-"+a*b);
		
	}
}
public class multipleinhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo3 D=new demo3();
D.put();
D.get();
	}

}
