package session20_1_Abstraction_2_By_AbstractionClass;

public class _3test {
	public static void main(String []args) {
		_3login test =new _3login();
		test.heading();
		test.logo();
		test.footerlinks();
		test.url();
		test.PrivacyPolicy();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		_2page ts =new _3login() ;
		ts.heading();
		ts.logo();
		ts.PrivacyPolicy();
		ts.url();
		ts.footerlinks();

		
	}

}
