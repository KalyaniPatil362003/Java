class demo
{
  demo(int x)
  {
    System.out.println("Constructor meyhod called...");
    System.out.println("X="+x);
  }
  protected void finalize()
  {
      System.out.println("Finalize method called...");
  }
}
class constructorfinalize
{
  public static void main(String args[])
  {
    demo d=new demo(10);
    d.finalize();
  }
}