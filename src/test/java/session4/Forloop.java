package session4;

public class Forloop {
	public static void main(String[] args) {
		//while loop
				int i= 0;//start point
				while(i<=10)// condition for end
				{
					
					//ur own logic
					System.out.println(i);
					//increment
					++i;//if it wiil out of bracket 
					//so 0 will print infinite
					//if i++  written before sysout den print from 1
					
	             }
				
				
				System.out.println("----------");
			//for loop (print 0 to 10
				for(int a=0; a<=10;a++)
				{
					System.out.println(a);
				}
				System.out.println("-------------------");
			// print 10 to 0	
				for (int b= 10 ; b>=0; b--) 
				{
					if(b==3)
					{
						System.out.println(" i got no. three");
						break;
					}
					System.out.println(b);// if this is before if den will print 3 also
				}
	}
}
