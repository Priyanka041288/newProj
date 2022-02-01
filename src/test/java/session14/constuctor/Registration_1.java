package session14.constuctor;

public class Registration_1 {
//
	String firstName ; // mandatory field
	String lastName ; // mandatory field
	long phonNumber ; // mandatory field
	String emailId ; // mandatory field
	String pasword ; // mandatory field
	String adress ; //  non mandatory field
	String dob ; // non  mandatory field
	String dlNumber ; // non  mandatory field
	String gender; // non  mandatory field
	boolean agelimit ; //  non mandatory field
	int OTP ; // mandatory field
	
	public Registration_1() {//zero para constructor
		System.out.println("please pass some values");
	}
	//with all or mendotory + non mendatory fields// constructor
	public Registration_1(String firstName,String lastName,long phonNumber,String emailId, 
			String pasword,String adress,String dob,String dlNumber ,String gender,
			boolean agelimit,int OTP) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.phonNumber=phonNumber;
		this.emailId=emailId;
		this.pasword=pasword;
		this.adress =adress ;
		this.dob=dob;
		this.dlNumber=dlNumber;
		this.gender=gender;
		this.agelimit=agelimit;
		this.OTP=OTP;
	}	
	//with only mendatory field//  multi para constructor
	public  Registration_1( String firstName,String lastName,long phonNumber,
			String emailId ,String pasword ){
		this.firstName= firstName;
		this.lastName=lastName;
		this.phonNumber=phonNumber;
		this.emailId=emailId;
		this.pasword=pasword;
		
		
	}
	//now we create method
	public void doRegistrationWithAllFild() {
		System.out.println(" processing registration with...\n"+firstName+" and "+phonNumber+" and "+lastName); 
		System.out.println(" "+emailId+" and "+pasword+" and "+adress);
		System.out.println(" "+dob+" and "+dlNumber+" and "+gender+" and  "+agelimit);
		System.out.println(+OTP);
		
	}
	public void  doRegistrationWithMandatoryFields() {
		System.out.println(" processing registration with mandatary fields../"+" "+firstName+" and "+lastName+" and "+phonNumber);
		System.out.println(" "+emailId+" and "+pasword+ " and  "+ OTP);
	}
	public void getOTP() {
		System.out.println(OTP);
	}
		
		
	
	}


