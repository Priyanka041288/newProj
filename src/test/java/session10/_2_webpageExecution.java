package session10;

public class _2_webpageExecution {
	public static void main(String[] args) {
	_1_webpage webpage	=new _1_webpage();//from another clas we called it
	webpage.centralpanel();
	webpage.footerlinks();
	webpage.topPanel();
	//run 
	//helpSection();//here we can not call it directly like this as we r in another clas
	//webpage.helpSection();
		//cal by clas name...outside the clas in static methode..this way
	_1_webpage.helpSection();
	
	//if we wish to call ref variable
	System.out.println("title for the application is:"+webpage.title);
	
	System.out.println("headre of app is :"+webpage.header);
	
	}

}
