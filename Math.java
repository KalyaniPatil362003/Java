import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of A:-");
		a=sc.nextInt();
		
		System.out.println("Enter value of B:-");
		b=sc.nextInt();
		System.out.println("--------------------------------------------------------");
		
		
		c=a+b;
		System.out.println("Addition Is:-"+c);
		
		c=a-b;
		System.out.println("Substraction Is:-"+c);
		
		c=a*b;
		System.out.println("Multiplication Is:-"+c);

		c=a/b;
		System.out.println("Division Is:-"+c);



	}

}
