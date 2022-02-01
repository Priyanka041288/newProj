package session19_1_finallynThrowsKeyword;

public class _1_finallyKeyword {
	public static void main(String []ar) {
		int a= 10;
//		try {
//			System.out.println("divison processs");
//			int k=a/5;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("some error ocured");
//output-division process
//-------------------------------------------------------
	
//		try {
//			System.out.println("divison processs");
//			//int k=a/5;
//			int k = a/0;
//		}
//		catch(Exception e) {//can write arithmatic
//			e.printStackTrace();
//			System.out.println("some error ocured");
//
//		}
////optional block 
//		finally //this executes every time whether exception caught by catch block or not...
//		{
//			System.out.println("process ended.......");
//		} //o/p== exce,som error,proces end
	//	----------------------------------------------------------
	//-------------------------------------------------------------
		try {
			System.out.println("divison processs");
			//int k=a/5;
			int k = a/0;
		}
		catch(NullPointerException e) { //wil not execute catch as wront exception clas 
			e.printStackTrace();
			System.out.println("some error ocured");

		}
////optional block 
		finally //this executes every time whether exception caught by catch block or not...
		{
			System.out.println("process ended.......");
		} //o/p== div pro,proces ended..n java internaly give exception
//-----------------------------------------------------------
//-----------------------------------------------------------
		//can we write try  n finally.. without catch block
//		//yes==but dont do it..cos no use of try wiyhout catch
		try {
			System.out.println("divison processs");
			//int k=a/5;
			int k = a/0;
		}


		
//optional block 
		finally //this executes every time whether exception caught by catch block or not...
		{
			System.out.println("process ended.......");
		} //o/p== divi,process end ..java exception
	}

}
