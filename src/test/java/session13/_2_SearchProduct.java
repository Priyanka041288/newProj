package session13;

public class _2_SearchProduct {
	//1. st
	public void search  (String productname)
	{
		System.out.println("search by- " +productname);
	}
	public void search (String productname, int price)
	{
		System.out.println("search by -"+productname+price);
	}
	public void search(String productname, int price, String sellername) 
	{
		System.out.println("search by -" + productname +price+sellername );
	}
	//2.nd
	public void payment(long ccnumber)
	{
		System.out.println("payment by credit card no -"+ccnumber);
	}
	public void payment(long ccnumber, int pin)
	{
		System.out.println("payment by  credit card n pin no-"+ccnumber+ pin);
	}
	public void payment(long ccnumber , int pin, String CardHolderNme)
	{
		System.out.println("payment by ccnum, pin, cardholder name -"+ccnumber+pin+CardHolderNme);
	}
	//HERE WE R OVERLODING WITH SEARCH
	//now will call, by impimanting
	public static void main(String[] args) {
		_2_SearchProduct shprodearc = new _2_SearchProduct();
		shprodearc.search("T-shirt");//called 1st method n implementing ie tshirt is imp
		shprodearc.search("walet", 899);//called 2nd n impl.
		shprodearc.search("bottle", 500,"unicorn enterpprices" );// 3rd
		System.out.println("------------");
		
		_2_SearchProduct makePaymnt = new _2_SearchProduct();
		makePaymnt.payment(1234567894);
		makePaymnt.payment(1234567894, 6789);
		makePaymnt.payment(1234567894, 6789, "priyaPatil");
		System.out.println("--------------");
		 
		_1_LogInApplication loginapp=new _1_LogInApplication();
		loginapp.login();
		loginapp.login(1234);
		loginapp.login("Preeti",234567 );
	
		
		
	}



}
