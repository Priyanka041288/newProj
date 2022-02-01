package session21;

public interface _1_USMedical extends _0_WHO {
	int min_fee =10;//by default the variables are static as well as final
	
   public void physioServices();//abstract (prototype) method
   //no need to write abstract by default as ,mention interface......
   
   public void oncologyServices();//abstract (prototype) method
   
   public void orthopedicServices();//abstract (prototype) method
   
   public void RadiologyServices();//abstract (prototype) method comon service also available in another interface
   
   //can not create object of interface
   //only method declaration..method prototype...no method body..abstract methods
   
   //can not create static abstract (prototype method in Interface....because we can not override static methods
   //example 
   
   //public static void public services();
   //interface variables are static and final by default
   
   //up to jdk 1.7 its not allow...but from jdk 1.8 its aow to hav static method in interface.
   //.but with method body..and also aloow default method wthi implementation
   
   //static method with method body
   public static void Services_911() {//it can not be change
	   //ie static method in interface...means this logic will not get chnge
	   System.out.println("US - 911 services........");
   }
   //default method can be overriden
   default void intership() {
	   System.out.println("US - INTERSHIP ....");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
