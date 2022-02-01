package session11;

public class UserDefinedMethods {//create own methodw with own logic
	//reason is for calling methods multiple times
	//just to reused the concept we create own method (if we dont hav
	//length metho we need to calculte manually everytime
	
	//1..no input no return method it is public void
	public void test() 
	//will print only statement  by calling.cos we not give any input
	//we can call it any method main method same of in another clas
	{
	System.out.println("this is test method");
	//in this will just call n print 0n  the console
	//it just print
	}
	public void run () {
		System.out.println("this is run method");
	}
	
	
	
	 
	//2...no input some return//means we want country nmae 
	//it is string so write string
	public String nameOfCountry()
	{
		String countryname="india";//if want to print call just this method ie country name
		return countryname;
		// in this will not print over the console 
		//but return something as an string with containing name as an india
		//for want return remove void..it returtn 
	}
	public String nameofcolg() {
		String  colg =" govt engg colg";
		return colg;
	}
	
	//3...
	public String[] listOfStudents() {//it will print and give list 
		//of students also ie //1+2
         //System.out.println("Students list -");//we wil create array with object
		String stdnames [] = new String[3];
		stdnames[0]= "raj";
		stdnames[1]= "rahul";//by calling method we get all three names
		stdnames[2]= "ram";
		return stdnames;
	}
	//3.1......
	//some input with some return
	public void addPrintOnly(int a, int b) //we take input from another
	{
		//if we want to take i/p some anothrt person//      //int a,b,c; geerally used
		int c=a+b;                                            //c=a+b;
		System.out.println(c);
	}
	public int	addReturn(int a,int b)//in above just print ..thats y void
	{
		int c= a+b;
		return c;//here we return value of c.. so c ans is int,,so int
	}
	
	//3.2....for print as wel return
	public String factoryName(String NameOfFactory)
	{
		if(NameOfFactory.equals("nike"))
		{
			String fact1 = "@@nike@@@";
			System.out.println("hey this is factory nike");
			return fact1;
		}
		else if (NameOfFactory.equals("puma")){
			String fact2 = "@@puma@@";
			System.out.println("hey this is factory puma");
			return fact2;
		}
		return "no factory found with given criteria";
		//do habit that the whole method gies ony single type of datatype
	}
	public String countryCapital(String nameOfCountry)
	{
		if(nameOfCountry.equalsIgnoreCase("india"))
		{
			System.out.println("new delhi");//we want to print also..print n return type
			return " new delhi";
		}
		else if(nameOfCountry.equals("usa"))
		{
       System.out.println(" washington DC");
			return "washington DC";
		}
		else {
			return "no country found";
		}
	}
	public static void main(String[]args) {//for calling methods we need to create  1ts 
		//object
		UserDefinedMethods userDefined =new UserDefinedMethods ();
		//                  lower            upper
		userDefined.test();//this is test method
		//userDefined.nameOfCountry();// it will not print so create variable 
		String country = userDefined.nameOfCountry();
		System.out.println(country);//india
		System.out.println(country + "  is a democratic country");
		System.out.println("-----------------------");
		// listb of students.. if we want to print value so
		String[] listOfStd =userDefined.listOfStudents();//create vari
		for(int i= 0; i<listOfStd.length;i++)  //for print all values
		{                                     
		System.out.println(listOfStd[i]);
		}
		System.out.println("-----------------------");
		System.out.println(userDefined.listOfStudents()[2]);
		                           // or ..here not create extra variable
		//for (int a=0; a<userDefined.listOfStudents().length;a++) 
		//{
		//System.out.println(userDefined.listOfStudents()[a]);
	//}   
		userDefined.addPrintOnly(15, 60);
		int total=userDefined.addReturn(15,60);
		System.out.println(total+70);
	
	     String brandname = userDefined.factoryName("puma");
	     System.out.println(brandname + "  he come here we r having offer of 50 rs.");
	    String cap  = userDefined.countryCapital("INDIA");
	     System.out.println(cap);
        
	     userDefined.run();
	     String colege = userDefined.nameofcolg(); 
	 System.out.println();
	
	
	
	
		

	
	
		
	
	

}
}