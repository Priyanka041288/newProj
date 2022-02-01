package session20_1_Abstraction_2_By_AbstractionClass;

public class _3_TestPage {
	public static void main(String[] args) {
		
		//_1_Page abs =new _1_Page//can not create object of abstract clas
		//as abs clas is incomplete clas 
//----------------------------------------------------
		_2_logInPage lp = new _2_logInPage();
		lp.title();
		lp.url();
		lp.footerLinks();
		lp.doLogin();
		lp.logo();
		lp.privacyPolicy();
		System.out.println("----------------------------------");
		
		_1_Page p = new _2_logInPage();//
		p.title();   ///cal from child   //cont from parent and child
		p.logo();//child
		p.privacyPolicy();//parent
		//p.doLogin(); it will not call.. cos its own method  of child..so not call
		System.out.println("------------------------------");
		
		
	
	}
//o/p==parent and child constructor fierst.....althought not called by us
}
