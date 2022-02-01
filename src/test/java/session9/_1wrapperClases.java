package session9;

public class _1wrapperClases {
	public static void main(String[]ar) {
		//how to convert sort of data types in  one form to another
		// use case of topic ie why we learn this
		// why this= in selenium fetch
		//1.string to integer
		System.out.println("strint to intger:");
		String x ="100";
		System.out.println(x+10);//10010 , cos string and integer
		String x1="200";
		int a =300;
		System.out.println(x1+a);//200300
		
		int a1=20;
		int a2= 30;
		System.out.println(a1+a2);//50
		System.out.println("--------------");

		String pric ="750";// main
		int charge= 50 ;//i want deliver charge to be add
		//System.out.println(price+charge);//ans is 75050 -- but want 800
		//so will convert 750 in to int
		System.out.println("---------------");
		int conValueofprice = Integer.parseInt(pric);//it is for price value converting in to intger 750
		System.out.println(conValueofprice+charge);
		System.out.println("--------------");


		//integer to string
		System.out.println("110"+10);//11010
		System.out.println(110+10);//120
		int vat= 10;
		String convalueofvat =String.valueOf(vat);
		System.out.println(convalueofvat);//10
		System.out.println(convalueofvat+20);//1020-- cos 10 convrt int string
        System.out.println("------------------------");

		//STRING TO DOUBLE
		System.out.println("string to doublr:");
		String memorysize ="8.2";//8.28
		System.out.println( memorysize+8);
		double convertval = Double.parseDouble( memorysize);
		System.out.println(convertval+8);//16.2.. cos now string 8.2 covrted in to dobl
		System.out.println("----------------------");        
         
		String mobmem = "4.3";
		System.out.println("mobmem+10");
		double covalll =  Double.parseDouble(mobmem);
		System.out.println(covalll+1.2);

		//example .. .. for rupi n dolr sign before value//strng to int
		//1. using replace
		String str="$200";
		String str1= str.replace('$', '0');
		System.out.println(str1);//0200
		int conval = Integer.parseInt(str1);
		System.out.println(conval+50); 
		System.out.println("--------------------");
		 //2. using substring
		String str4= "$300";
		String str5= str4.substring(1);
		System.out.println("extracted part is:"+str5);//300
		int coval= Integer.parseInt(str5);
		//System.out.println("the final value is :" +coval+50);//30050
		System.out.println("the fine val:"+(coval+50));
		
//		 String dollr = "$500 ";
//		  String dol1 = dollr.substring(1);
//		  System.out.println(dol1);
//		  int cvle = Integer.parseInt(dol1);
//		  System.out.println(cvle+50);
//		  
		  String mem = "3";
		  byte z = 5;
		  byte covalmem =Byte.parseByte(mem);
		  System.out.println("addition is:"+(covalmem+z));
		  
		 int s=90;
		 String q= "40";
		 System.out.println(s+q);
		String convvalofq = String.valueOf(s);
		System.out.println(convvalofq+q);
		 
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		    
		    
//string to int
		String helo = "200";
		int val = 50;
	    int convalu = Integer.parseInt(helo);
	    System.out.println(convalu+val);
//string to double
	    String melo = "200";
		double vale = 5.0;
	    
	    System.out.println(convalu+val);
	 
	    






































	}
}