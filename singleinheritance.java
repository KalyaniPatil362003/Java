package singleinheritance;

import java.util.Scanner;
class stud
{
     int rollno,m1,m2,m3,m4,total;
     
     Scanner S=new Scanner(System.in);
     void get()
     {
   System.out.println("Enter Roll Number:-");
   rollno=S.nextInt();
   
    System.out.println("Enter M1:-");
   m1=S.nextInt();
   
   System.out.println("Enter M2:-");
   m2=S.nextInt();
   
   System.out.println("Enter M3:-");
   m3=S.nextInt();
   
   System.out.println("Enter M4:-");
   m4=S.nextInt();
   
   System.out.println("**********************");
     }
}
   class sub extends stud
   {
       void put()
       {
           System.out.println("Roll Number Is:-"+rollno);
            System.out.println("First paper Marks:-"+m1);
            
            System.out.println("Second paper Marks:-"+m2);
            
            
            System.out.println("Third  paper Marks:-"+m3);
            
            
            System.out.println("Fourth paper Marks:-"+m4);
            
            total=m1+m2+m3+m4;
            System.out.println("Total Is:-"+total);
           }
       }


public class singleinheritance 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
sub obj=new sub();
obj.get();
obj.put();
	
	}
}
