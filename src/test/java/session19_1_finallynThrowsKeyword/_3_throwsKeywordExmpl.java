package session19_1_finallynThrowsKeyword;
//throwskeyword for exception handling for variable and method
public class _3_throwsKeywordExmpl {
//	public static void main(String[] args) {
//		_3_throwsKeywordExmpl objref =new _3_throwsKeywordExmpl();
//		objref.launchbrowser();
//	}
//	public static void launchbrowser() {
//		System.out.println("launch browser...........");
//		launchUrl();
//	}
//	public static void launchUrl() {
//		System.out.println("launch url.........");
//		logIn();
//	}
//	public static void logIn() {
//		System.out.println("do login to the application.....");
//		int a= 9/0;
//	}
	
	
//o/p== launchbrowser...launchirl..do login to application..den..exception big of 4 methods
	//above exception is the stack track of the exception starting from main method
	//launchbrowser->launchurl->login-
	//SO THIS WE CAN HANDLE WITH THROWS
	
	public static void main(String[] args) throws ArithmeticException {
		_3_throwsKeywordExmpl objref =new _3_throwsKeywordExmpl();
		objref.launchbrowser();
	}
	
	public static void launchbrowser () throws ArithmeticException  {
		System.out.println("launch browser...........");
		launchUrl();
	}
	public static void launchUrl() throws ArithmeticException{
		System.out.println("launch url.........");
		logIn();
	}
	public static void logIn() throws ArithmeticException{
		System.out.println("do login to the application.....");
		int a= 9/0;//if this line issue..use throws exception ..
		//or can writearithmatic excep
		//if user put value ie x n y..9,0//it may throws exception
		//thats y mention thrws..and doen to top..passing out the responsibility
		//from --log --to url-- to brows-- to main ....to handle..like pasing ball
		//JAVa will print strack
	}
	//O/P==launchbrow,launchurl,do login , exception by java
	//this is not proper way

}
