import java.util.Scanner;
interface A
{
  void read();
  void display();
}
class B implements A
{
  int a,b,c;
  Scanner s=new Scanner(System.in);
  public void read()
  {
    System.out.println("Enter First Number:-");
    a=s.nextInt();
    System.out.println("Enter Second Number:-");
    b=s.nextInt();
  }
  public void display()
  {
    c=a+b;
     System.out.println("Addition Is:-"+c);
  }
}
class interface1
{
	public static void main(String args[])
	{
		B d=new B();

	   d.read();
	   d.display();
	}
}