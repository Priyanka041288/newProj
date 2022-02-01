package session11;

public class USM {
	//no i/p ..no o/p
	public void check() {
		System.out.println("this is check method");
	}
	public void run() {
		System.out.println("this is run methd");
	}
	public String nameofinst( String institute) {
		if (institute.equals("saradar patel" )) {
			String ins1 ="@@sardar@@";
			System.out.println("this is sardar vallabha bhai patel");
			return ins1;
		}
		else if (institute.equals("rani laxmibai")) {
			String ins2 ="@@laxmibai@@@";
			System.out.println("this is rani laxmibai ");
			return ins2;
		}
		else {
			return  "no suc institude is there in pune";
		}
		
	
	}
	public String namecountry(String countnam) {
		if (countnam.equals("india")){
			System.out.println("new delhi");
			return "new delhi";
		}
		else if(countnam.equals("Us")){
			System.out.println("washington dc");
			return "washington dc"; 
		}
		else {
			return "no country found";
		}
	
	}
	public  String [] listofstd() {
		String [] Stdname = new String[4];
		Stdname [0]= "ranu";
		Stdname [1]= "sanu";
		Stdname [2]= "tanu";
		Stdname [3]= "manu";
		return Stdname;
		
	}
  public void addprint(int a , int b) {
	  int c= a+b;
	  System.out.println(c);
  }
  public  int addreturn(int a, int b) {
	  int c = a+b;
	  return c;
  }
  public static void main(String []ar) {
	  USM re =new USM ();
	  re.addprint(10, 20);
	  int total = re.addreturn(20, 50);
	  System.out.println("the totaal is "+(total +30));
	  re.check();
	  re.run();
	  String con =re.namecountry("Us");
	  System.out.println("the country is"+con+" this is very nice country ");
	  re.namecountry("india");
	 String insta = re.nameofinst("saradar patel");
	 System.out.println(insta+"we r admiting with less fees");
	  String [] list = re.listofstd();
	  for (int i=0; i<list.length;i++) {
		  
	  System.out.println(list[i]);
	  }
	  
	 
  }
  
}
