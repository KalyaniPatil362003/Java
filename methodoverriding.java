class overriding
{
  void run()
  {
   System.out.println("This is Base class of overriding");
  }
}
class overriding1 extends overriding
{
  void run()
  {
	  super.run();
   System.out.println("This is Derived class of overriding");
  }
}

class methodoverriding
{
 public static void main(String args[])
 {
  overriding1 obj=new overriding1();
  obj.run();
}
 }