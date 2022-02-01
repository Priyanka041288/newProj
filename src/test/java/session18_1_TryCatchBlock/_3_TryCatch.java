package session18_1_TryCatchBlock;

public class _3_TryCatch {
//	public static void main(String[] args) {
//		 _3_TryCatch tc =new  _3_TryCatch();
//		 //handling exception at method calling level
//		// tc.division(9,3);
//		 try
//		 {
//		tc.division(9,0); //if 9/3..it will not execute catch block
//		 }
//		 catch(Exception e)
//	 {
//			 e.printStackTrace();
//			 System.out.println("an exception at divion of integer c");
//		 }
//		 //i hav return 1 method
//	}
//		 public void division(int a , int b)
//		 {
//			 int c= a/b;
//			 System.out.println("divion of input "+a+"and"+b+"is:" +c);
//		 }
//		
//}
	//-----------------------------------------------------
	//here i write try catch in method create by me.. instead of  directly main method 
public static void main(String[] args) {
	 _3_TryCatch tc =new  _3_TryCatch();
	 tc.division(9, 0);
}
	 

	 public void division(int a , int b)
	 {
		 //handling exptn inside method
      try
      {
		 int c= a/b;
		 System.out.println("divion of input "+a+"and"+b+"is:" +c);
	 }
      catch(Exception e)
      {
    	  e.printStackTrace();
    	  System.out.println("an exception icur in div of c");
      }
	
}
	 }

