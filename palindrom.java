package palindrom;


 import java.util.Scanner;
 class demo
 {
	 
	 int no,temp,s=0,r;
 
 void input()
 {
	 System.out.println("Enter Number:-");
	 Scanner S=new Scanner(System.in);
	 no=S.nextInt();
	 
 }
 void output()
 {
	 temp=no;
	 while(no>0)
	 {
		 r=no%10;
		 s=s*10+r;
		 no=no/10;
		 
	 }
	 if(temp==s)
	 {
		 
		 System.out.println("Given Number Is Pallindrom");
	 }
	 else
	 {
		 System.out.println("Given Number Is Not Pallindrom");
 
		 
 }
 }
 }
 
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   demo D=new demo();
   D.input();
   D.output();
	}

}
