package session10;

public class _2_web {
	String title = "cook with love";
	String logo = "www.image.com";
	String url= "www.amazon.in";
	String  header = "cook with love";
	public void topPanel()
	{
		System.out.println(" url");
		System.out.println("logo");
		System.out.println("title");
		System.out.println("----------");
	}

	public void midlePanel() {
		System.out.println("table");
		System.out.println("chairs");
		System.out.println("glasset");
		System.out.println("jar");
		System.out.println("-------------");
	}
	public void bottomPanel()
	{
		System.out.println("link1");
		System.out.println("link2");
		System.out.println("link3");
		System.out.println("------------");
	}
	
	public static void helpSection()
	{
		 System.out.println("about the cafe");
		 System.out.println("location");
		 System.out.println("delivery point");
		 System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		_2_web cafe =new _2_web();
		
		cafe.bottomPanel();
		cafe.midlePanel();
		cafe.topPanel();
		helpSection();
		System.out.println("logo for it is"+cafe.logo);
		System.out.println(" heading for the cafe is"   +cafe.header);
		
	}

}
