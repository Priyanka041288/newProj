package session4;

public class Whileloop {
	public static void main(String[] args) {
		//no. print from 1 to 10, loops arev use for iteration, either from positive
		//or negative side
		System.out.println("0");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("--------");
		//while loop
		int i= -4;//start point
		while(i<=10)// condition for end
		{
			//ur own logic
			System.out.println(i);
			i++;//increment
			//++i;
		}
		System.out.println("---------");

		int j= 0;
		while (j<=10)
		{
			System.out.println(j);
			if (j==5)
			{
				System.out.println("i got no. 5");
				break;
			}
			j++;
		}
		System.out.println("---------------");

		int dayofweek = 4;
		switch(dayofweek)
		{
		case 0:
			System.out.println("the day is monday");
			
		case 1:
			System.out.println("the day is tuesday");
			break;
		case 2:
			System.out.println("the day is wensday");
			break;
		case 3:
			System.out.println("the day is thursday");
			break;
		case 4:
			System.out.println("the day is friday");
			
		case 5:
			System.out.println("the day is satrday");
			
		case 6:
			System.out.println("the day is sunday");
			break;
			default :
				System.out.println("plz enter between 0  to 6");
			
			
			
		}
      int k =76;
      while(k<=80)
      {
    	
    	  System.out.println(k);
    	  k++;
      }
      
      int l= 45;
      do {
    	  System.out.println(l);
    	  l++;
    	  
      }
      while(l<=50);
      
     // int r= 33;
      for(int r =33 ; r<=40; r++)
      {
    	 System.out.println(r); 
      }

	}
}