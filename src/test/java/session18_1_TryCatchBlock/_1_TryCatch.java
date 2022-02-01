package session18_1_TryCatchBlock;

public class _1_TryCatch {//try catch two subsequent blocks whic come ane atfer another
	public static void main(String[] args) {
		//if we go to any atm macine it will show the good msg that u dont hav balmce
		// for that we hav exeption handling
		
		//Exception==it is unexpected situation where java is unable to proceed with the code'
		//and the further flow of program breaks down
		//eg.1.eny value divided by zero..(and we get msg in exception)
		
		//2.accessing any value out of the range of array
		//Exception Handling==to do make execution of a program uninterupted
		///we should handle the exception..
		
		//Error==it indicates serious problem and abnormal conditions that most application
		//should not try to handle..eroor defines problem that are not expected to be caught,
		//under normal circumstances by our program.
		//eg..memory error ,hardware eror,jvm error etc.(one clas in another clas)
		//we can not handle error..if power is gone in atm
		
//		
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		int a=9/0;//ABC and den arithmatic exception(clas)..program stop.
//		
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
//---------------------------------------------------------------------
//so we hav try and catch..write where risky code....having problem
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		try {
//		int a=9/0;
//		}
//		catch(Exception e){
//			//handle exception
//		}
//		System.out.println("D");
//		System.out.println("E");
//		System.out.println("F");
		///den will get proper ans..
//---------------------------------------------------------------------
		//now if  we want so to give msg or printing some thing what is problem ..den
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try {
		int a=9/0;
		}
		catch(Exception e)
		//catch is keyword..prin
			{
			e.printStackTrace();// good practice ..method from ..throable clas ..exception clas
			System.out.println("an exception occured at division of integer a");
			///den it will execute program.. n also msg.. and the exceptiom msg 
			//what is problem to undestnd another programmer.
			}
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
	}

}
