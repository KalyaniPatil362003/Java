
import java.util.Scanner;
class Info
{
public static void main(String[] args)
{
	int m1,m2,m3,Result;
	for(int i=1;i<=2;i++)
	{
		
		Scanner Sc=new Scanner(System.in);
		
		
		System.out.println("Enter Name:-");
		String name=Sc.nextLine();
		
		System.out.println("Enter Mobile Number:-");
		long mob=Sc.nextLong();
		
		
		System.out.println("Enter Class:-");
		String C=Sc.next();
		
		System.out.println("Enter Roll Number:-");
		int roll=Sc.nextInt();
		
		System.out.println("Enter Fisrt Sub Marks");
		m1=Sc.nextInt();
		
		System.out.println("Enter Second Sub Marks");
		m2=Sc.nextInt();
		
		System.out.println("Enter Third Sub Marks");
		m3=Sc.nextInt();
		
		Result=m1+m2+m3;
	
		
		
		System.out.println("------------------Student Information-----------------------");
		System.out.println(" Name Is:-"+name);
		System.out.println(" Mobile Number Is:-"+mob);
		System.out.println(" Class  Is:-"+C);
		System.out.println(" Roll Number Is:-"+roll);
		System.out.println("Fisrt Sub Marks:-"+m1);
		System.out.println("Second Sub Marks:-"+m2);
		System.out.println("Third Sub Marks"+m3);
		System.out.println("Result Is:-"+Result);
		
	   
	    
	    System.out.println("------------------------------------------------------------");
	}
	
}
}
