package session3;

public class Comparisionoperator {
	
	
	public static void main(String[]ar) {
		
//		== comparision
//		<,>,<=,>= 
//		!= (not equal to 
//		&& AND operator (short circuit operator
//		|| OR operator	
		
		int a= 10;
		int b= 20;
		//1.
		if (a>b) 
		{
			System.out.println(" a is greater than b");
			
		}
		else
		{
			System.out.println(" b is greater than  a");
		}	
		System.out.println("---------------");
		
		//2.
        if (a>b)
        {
        	System.out.println("a is greater");
        }
        else {
        	System.out.println("b is greater or equal to a");
        }
           System.out.println("---------------------------");
           
           //3.
        if (a>b)
        {
        	System.out.println("a is greater");
        }
        else if(b>a)
        {
        	System.out.println("b is greater");
        }
        else {
        	System.out.println("a is equal to b");
        }
     // not equal to
        int total= 100;//condition is total should not be 0
       if (!(total==0))
       {
       	System.out.println("give him 10% discount");
       }
       else {
       	System.out.println("dont give him discount");
       }
       
       int q = 40; //check condition for q is having value 5
       if  (q==5)
       {
       System.out.println("q is having value 5");
       }
       else 
       {
    	   System.out.println("q is not having value 5");
       }
    	   
       //
       int e= 10;//chek e>10 den check whether e = 15 or 17(check for  e=9)jn  n
       if (e>10)
       {
    	   if (e==15)
    	   {
    		System.out.println("e is equal to 15");   
    	   }
    	   if ( e==17)
    	   {
    		   System.out.println("e is equal to 17");
    	   }
    	   else
    	   {
    		   System.out.println(" e is not having 15 nor 17");
    	   }
       }
       else 
       {
    	   System.out.println("condition is  not satisfied");
    	   
       }
       System.out.println("--------------");
       
        //find heighest among  3 using && operator
    int x= 1000;// after change value x, y , z
    int y= 2000;
    int z= 300;
    if (x> y && x>z)
    {
    	System.out.println("x is greatest");
    }
    if (y>z)
    {
    	System.out.println("y is greatest");
    }
    else
    {
    	System.out.println("z is greatest");
    }
    //use or || operator
    
   String Username ="ranu";
   if (Username == "johny" || Username == "ranu")
   {
	   System.out.println("hay devloper");
   }
   else if (Username=="TOM" || Username == "sonu")
   {
	   System.out.println("hay amazing QA");
   }
   else
   {
	   System.out.println("how may i can help you");
   }
   System.out.println("---------");
   ///----
//   int c= 10;
//   if (false)//c==10
//   {
//	   System.out.println("A");
//   }
//   else
//   {
//	   System.out.println("B");
//   }
//    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  }
}
