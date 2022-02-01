package session19_1_finallynThrowsKeyword;

public class _4_throwsKeywordExmpl {
	//here is proper way..not pasing responsiblity ..using try catch
	public static void main(String[] args) {
		_4_throwsKeywordExmpl objref =new _4_throwsKeywordExmpl();
		objref.launchbrowser();
	}
	
	public static void launchbrowser() {
		System.out.println("launch browser...........");
		launchUrl();
	}
	
	public static void launchUrl() {
		System.out.println("launch url.........");
		//logIn();//we can give try catch here
		try {
			logIn();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("somethong went wrong while login application");
		}
	}
	
	public static void logIn() {
		System.out.println("do login to the application.....");
		//try
		//{//this is proper way
		int a= 9/0;
		//}
		//catch(Exception e) {
			//e.printStackTrace();
			//System.out.println("somethong went wrong while login application");
		//}
		System.out.println("hbkjbjb");
	}
	///o/p==brow,url, do login,stractrace,somthing went,hbk

}
