package seris;

class seris1
{
  int a,b,i;
  
  void get()
  {
	  for(i=2;i<=8;i++)
	  {
		  a=i*i*i;
		  b=i*i;
		  System.out.println(a-b);
		  
	  }
	   
  }
}

public class seris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  seris1 S=new seris1();
  S.get();
	}

}
