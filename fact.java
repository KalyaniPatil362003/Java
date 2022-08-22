package fact;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
	
    int i,n,fact=1;
    
    System.out.println("Enter The Number:-");
    
    Scanner sc=new Scanner (System.in);
    
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
    {
    	fact=fact*i;
    	
    }
    System.out.println("Fact is:-"+fact);
	}

}
