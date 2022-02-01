package session20_1_Abstraction_2_By_AbstractionClass;

public class _2_logInPage  extends _1_Page{
	
	public _2_logInPage() {//login page constructor
		System.out.println("login page consts.......................");
	}
	
	//if alll below is coment ..den in clas will give error ..
	//if we hover on that n click on it...it will automaticaly create method 
	//as it extent a parent page clas
	
	@Override
	public void title() {
		System.out.println("log in page.. title");//our logic on abstract method
	}
	
	@Override
	public void url()//we  should overdide this three from page clas
	{		
		System.out.println("http://google.com");
	}
	@Override
	public void footerLinks() {
		System.out.println("log in page.. footerlink");
	}
	@Override
	public void logo() {//it also can overide if we want
		System.out.println("log in page.. logo");
	}
	
	//we can not overide final method..it will show error
	//@Override
//	public void privacyPolicy() {
//		System.out.println("change some privacy policy for log in page....");
//	}
	//special method for this class
	public void doLogin() {
		System.out.println("login to app.....");
	}
	
	//now will create test page having main method
	
	
    

}
