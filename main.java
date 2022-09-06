
interface A
{
void read();
}
class B implements A
{
 public void read()
 {
	 System.out.println("value Of A:-10");
	 System.out.println("value Of B:-20");
 }
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.read();
	}

}
