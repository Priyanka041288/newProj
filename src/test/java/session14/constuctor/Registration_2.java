package session14.constuctor;

public class Registration_2 {
	public static void main(String[] args) {
		 Registration_1 reg =new  Registration_1();//constructor withzero para
		 //will automatic call
			 //registration with all fields
		// Registration_1 reg1 =new  Registration_1 ("priya","patil",77458793,"priyapayahoo.com",
		// "Sadashiv3","04/12/1988","aa-vst-123","female","ranu", true,7654);
				 //regi with mandatory
	// Registration_1 reg2 =new  Registration_1 ("priya","patil",77458793, "priya@yahoo.com", null, null, null, null, null, false, 3456); 
		
	System.out.println("-------------------------------");
	reg.doRegistrationWithAllFild();
	System.out.println("----------------");
	reg.doRegistrationWithMandatoryFields();
	
	 }	
	}


