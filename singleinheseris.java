package singleinheseris;

class demo
{
   int i;
}
class demo1 extends demo
{
   void read()
   {
   for(i=1;i<=9;i++)
   {
      
       if(i==3 || i==6 || i==9)
       {
           System.out.println(i*5+1);
       }
       else{
           System.out.println(i*5);
       }
       
   }
   
   }
}
   

public class singleinheseris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d1= new demo1();
		d1.read();
	
	}

}
