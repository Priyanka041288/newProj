package session10;

public class _1_webpage {
	//to create clas should not start with no. or lower case
	//we can give #, _
	//variables
	String title="welcome to amazon";
	String url="https:/www.amaazon.in";
	String header ="amazon.in : mobile";
	String logoimage ="https:/www.amaazon.in/ref=nav_logo";

	//non static method
	public void topPanel()
	{
		//logic
		System.out.println("------top panel start---------");
		System.out.println(url);
		System.out.println("this is the top pannel of the appl");
		System.out.println(title);
		System.out.println(logoimage);
		System.out.println("------top panel end---------");

	}
	public void centralpanel() 
	{
		//logic
		System.out.println("------central panel start---------");
		System.out.println("mobile");
		System.out.println("laptop");
		System.out.println("books");
		System.out.println("kitchen ware");
		System.out.println("------central panel end---------");


	}
	public void footerlinks()
	{
		//logic
		System.out.println("-------------footerlinks start--------------------");
		System.out.println("link- 1");
		System.out.println("link- 2");
		System.out.println("link- 3");
		System.out.println("-------------footer links end --------------------");
        System.out.println("--------------------");

	}
	public static void helpSection()
	{
		System.out.println("-------------help section start --------------------");
		System.out.println("about the app");
		System.out.println("location");
		System.out.println("privacy note");
		System.out.println("-------------help section  end --------------------");
		System.out.println("-----------------");
	}
	public static void main(String []ar)
	
	{
		_1_webpage webpage_1 = new _1_webpage();
	// datatype    ref.ar vari     object
		//object store in same data type 
		//here web is data type ..this is not static
		webpage_1.topPanel();	
		webpage_1.centralpanel();
		webpage_1.footerlinks();
		webpage_1.helpSection();
		helpSection();
		
		_1_webpage webpage_2 = new _1_webpage();
		webpage_2.topPanel();	
		webpage_2.centralpanel();
		webpage_2.footerlinks();
		webpage_2.helpSection();
		helpSection (); // another way to cal help section which is static
		//static means whic realy comon /specific and not going  to change

	}









}
