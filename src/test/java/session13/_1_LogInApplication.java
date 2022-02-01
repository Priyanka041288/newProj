package session13;

public class _1_LogInApplication {
	
	//how to login=otp, user name, pasword
	//overloding-called method from backend 
	//if same method ,which is having diff. parametr,..n login can be done 
	//in diffe. ways
//overloding--to avoid confusion,we use to create same method with diife parametr..
//overloading comes under OPPS concept, polymerisation ..same name ..diff. para
	//login can be done by-alraedy stored crentials means nothing(user name paswod
	//(user name, pasword,OTp, username-pasword, phone no. and pasword, 
	//user name n phon eno.
	//functality remain same ie LOGIN...
	//overloading means--if we want log in , their r diff types, 
	//so to minimize,, from remembring all methods 
	//the burdon from this all methods just go from the list
	//WE CAN NOT CREATE SAME METHOD IN SAME CLAS WITH SAME para
	//overlodin RULES- 1.can achived only in same clas only
	//2.type of para should be diff.
	//3.sequence of parameter alsoshould be unique
	//4. static methods also overloaded
	//5.every method wil have diff. logic
	public void login() {
		System.out.println("login to app with alreday stored crentials");
	}
	//public void login() {
	//	System.out.println("hii there");
	//}.... it wil so exception cos same method and parametr..so 1 should remov
	
	public void login(String username) {
		System.out.println("login to app with- "+username);
		//logic//diff para
			}
	public void login(int OTP)
	{
	System.out.println("login to app with -" + OTP);
	//logic..java will thrown exception duplicate method
	}
	public void login( String Username, String Password)
	{
		System.out.println("login to app with-" + Username + Password);
		//logic
	}
//	public void login( String Password , String  Username)
	//{
	//	System.out.println("login to app with-" + Username + Password);
		//logic---it wi show exce. cos same datatype combination n parameter also
	//ie string string cant use again 
	//}
	public void login( int PhoneNo, String Password)
	{
		System.out.println("login to app with-" +PhoneNo + Password);
	}
	public void login( String Username, int PhoneNo)
	{
		System.out.println("login to app with-" + Username + PhoneNo);
	}
}










