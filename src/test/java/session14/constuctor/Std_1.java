package session14.constuctor;

public class Std_1 {
	 String name ;
	 int age;
	 String branch;
	 double height;
	 static String SchoolName;
	 
	 public static void main(String[]args) {
		 Std_1 st = new Std_1 ();
		 st.name = "sammy";
		 st.age = 35;
		 st.branch = "mechanical";
		 st.height=5.9;
			
		 Std_1 stn = new Std_1 ();
		 stn.name="jimmy";
		 stn.age= 40;
		 stn.branch="electrical";
		 stn.height=5.6;
		 
		 System.out.println("1 st student info");
		 System.out.println(" name " +st.name);
		 System.out.println(" age "+st.age);
		 System.out.println(" branch "+st.branch);
		 System.out.println(" height "+st.height);
	     System.out.println("---------------------");
	     
	     System.out.println("2nd student info");
	     System.out.println(" name " +stn.name);
		 System.out.println(" age "+stn.age);
		 System.out.println(" branch "+stn.branch);
		 System.out.println(" height "+stn.height);
	     System.out.println("---------------------");
		
	 }
	 
	 

}
