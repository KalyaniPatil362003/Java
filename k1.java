package k1.java;

public class k1 {
    	public static void main(String args[]) {
    	    
    	    				
    	int num=3;    				
		for (int i=1; i<6; i++) {
			System.out.print(i+" ");			
		}
		System.out.println("\n");
		
	System.out.print("  ");
  
	for (int i=4; i<9; i++) {
			if(i%2==0)
			System.out.print(i+" ");			
		}
		System.out.println("\n");
	
			
		for (int i=9; i<=10; i=i+3) {
           if(i==3)	
           {
               System.out.print("       "   +i);
               }	
               
            else if(i==9)	
            
            {
                System.out.print("    "+i);
            }
            
            else{
                System.out.print("     ");
            }
		}
		System.out.println("\n");
					System.out.print("  ");
			for (int i=8; i<=16; i++) {
			    if(i%4==0)
			System.out.print(i +" ");			
		}
		System.out.println("\n");
		
		for (int i=1; i<30; i++) {
			if (i%5==0) System.out.print(i +" ");			
		}
		System.out.println("\n");
    	}
}
