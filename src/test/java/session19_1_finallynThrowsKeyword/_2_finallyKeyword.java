package session19_1_finallynThrowsKeyword;
//this is finally block in exception handling by try catch
public class _2_finallyKeyword {
	public static void main(String[] args) {
		int p= getNumber();
		System.out.println(p);
	}
	//create method
//	public static int getNumber() {
//	 int a=10;
//	 //int b=5;
//	 int b=0;//if this ..o/p==bye ,-1
//	 try {
//		 int c=a/b;
//		 return c;
//	 }
//	 catch(Exception e){
//		 return -1;//can return any  instead -1
//		 
//	 }
//	 finally {
//		 System.out.println("bye........");//o/p== bye, 2.
//		 //cos aftter finally block..c value asign in p..n p will print ..ans ie 2
//	 }
////---------------------------------------------------------------------------------
//---------------------------------------------------------------------------------
//	 public static int getNumber() {
//		 int a=10;
//		 int b=20;//      o/p==bye,100..cos it overide the output of try ie 30
//	    
//		 try {                 
//			 int c=a+b;
//			 return c;
//		 }
//		 catch(Exception e){
//			 return -1;//can return any  instead -1
//			 
//		 }
//		 finally {
//			 System.out.println("bye.......");
//			 return 100;//we can not return in finsllly block ..it will change tha value
//			 //or main execution
//		 }
//		 public static int getNumber() {
//			 int a=10;
//			 int b=0;//      o/p==stractrace,bye ,100
//		    
//			 try {                 
//				 int c=a/b;
//				 return c;
//			 }
//			 catch(Exception e){
//				 e.printStackTrace();
//				 return -1;//can return any  instead -1
//				 
//			 }
//			 finally {
//				 System.out.println("bye.......");
//				 return 100;//we can not return in finsllly block ..it will change tha value
//				 //or main execution
//			 }
	//----------------------------------------------------------
	//-----------------------------------------------------------
			 public static int getNumber() {
				 int a=10;
				 int b=0;     // o/p== stractrace by java..bye ..if  we no return 
			                  //o/p==bye ,100..if write return
				 try {                 
					 int c=a/b;
					 return c;
				 }
				 catch(NullPointerException e){ //wrong exception..not execute
					 return -1;//can return any  instead -1
					 
				 }
				 finally {
					 System.out.println("bye.......");
					// return 100;
				 }
			 
	 
	}

}
