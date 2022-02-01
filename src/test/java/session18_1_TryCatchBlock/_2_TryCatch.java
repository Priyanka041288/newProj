package session18_1_TryCatchBlock;

public class _2_TryCatch {
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try {
	   int a=9/0;
		}
		catch(Exception e) {//here we can write arithmatic exception
			e.printStackTrace();//now here exception msg will come on another line
			//ie line no. 9
			System.out.println("an exception occured at division of integer a");
		}
		
		System.out.println("D");
		System.out.println("E");
 	    System.out.println("F");
//--------------------------------------------------------------------------------
		System.out.println("A");
		System.out.println("B");
    	System.out.println("C");
		try {//if we konw exact exception mention that only as a good practice
			//or parent exeption
	   int a=9/0;
		}
		//
		catch(NullPointerException e) {//by mistake if we write nullpointer exception instate of arithmatic
			//den out put wil give arithmatic exception
			//and not execute catch block..due to null exception instead arith excptn
			e.printStackTrace();//now here exception msg will come on another line
			//ie line no. 9
		System.out.println("an exception occured at division of integer a");
	}
		
		System.out.println("D");
		System.out.println("E");
 	    System.out.println("F");
	}

}
