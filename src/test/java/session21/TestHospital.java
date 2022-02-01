package session21;

public class TestHospital {
	public static void main(String []args) {
	//_1_USMedical ushp =new _1_USMedical();//we can not create object of interface
		//if we want implement den USE THIS BY OBJECT CREATING
	_4_AppoloHospital ap =new  _4_AppoloHospital();
	
	ap.ambulanceServices();
	ap.emergencyServices();
	 ap.ENTServices();
	 ap.MedicalInsurance();
	 ap.neuroServices();
	 ap.orthopedicServices();
	 ap.RadiologyServices();
	 ap.getPatientHistory();
	 System.out.println("-------------------------");
	 //this is ok...this is normal things
	 //now how to call variable ie static in final nature in interface
	 System.out.println(ap.min_fee);
	 System.out.println(_1_USMedical.min_fee);
	// _1_USMedical.min_fee= 20;//we can not change value..as it is final
	 _1_USMedical.Services_911();
	 ap.intership();//com from aoplo ..cos overided..if not.comes from apolo
	 ap.getPatientHistory();
	 System.out.println("--------------------------------");
	 
	 //now...so we hav interface...so we r not folowing above from now
	 //cos how we shoer that..what the interface is having as an oblication ,
	 //as an rule, is implemented inside apolo..ok...
	 //so hospitl or any clas 
	// so we do ...top casting....
	 
	 _1_USMedical us = new _4_AppoloHospital();
	 us.physioServices();
	 us.oncologyServices();
	 us.orthopedicServices();
	 us.intership();
	// us.opservices()// cant call cos..they r specialise  of apolo
	 //we can only cal comon method ..which r available  interface..  implemted by the clas
	 //not the soecialised method
	 //us.pathology()
	 //us.medicalinsurance()
	 us.polioServices();//call cos usmedical extends WHO
	 
	 //we can not create object of interface pointed b y a clas
	 
	 //down casting
	 //its not allowed
	 //as object of interface can not  be created
	 //_4_AppoloHospital asd =new _1_USMedical();//us medical is interface
	 System.out.println("----------------------------");
	 _2_UKMedical uk= new _4_AppoloHospital();
	 uk.ambulanceServices();
	 uk.ENTServices();
	 uk.polioServices();
	 uk.RadiologyServices();
	 
	 //Selenium web driver is  just INTERFACE..sele no having direct method implementation
	 //gives only method..and what ever browser is  choose to run ..
	 //so we r having diff. classes..chrome driver, firefox,opera,s,safari
	 //this driver clases having the implementation
	 //every browser  work internally  diferently
	 
			 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}