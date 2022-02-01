package session20_1_Abstraction_2_By_AbstractionClass;

public  abstract class _2page {
	public _2page () {//constructor
		System.out.println("hello..do lohin here");
	}
	public abstract void heading() ;  //abstract method
	public abstract void url();
	public abstract void footerlinks();
	
	public void logo () {
		System.out.println("https://www.youtube.com");
	}
	public final  void PrivacyPolicy() {
		System.out.println("this privacy policy");
	}
	
	
		

}
