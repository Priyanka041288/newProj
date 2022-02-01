package session6;

public class Stringmani {
	public static void main(String []a) {
		String strg5=  "my name is priyanka";
		System.out.println("the length of string is:"+strg5.length());
		System.out.println(" charcter at 2nd index  position is:" +strg5.charAt(2));
		System.out.println(" charcter at 0th  position is:" +strg5.charAt(0));
		System.out.println("the index position of character r is:" +strg5.indexOf('r'));
		int  indexofr = strg5.indexOf("r");
		System.out.println( indexofr);
		
	String name ="my country name is india";
	int contname =+name.length();
	System.out.println(contname);
        
		String strg9= " your transaction id is AAA3y88hk";// 2nd type of index
		int transid = strg9.indexOf("AAA");
		//System.out.println(strg9.indexOf("BBB" ));
		System.out.println( transid);
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		String strg24 = " where are you from ";
		System.out.println("the length of string is:"+strg24.length());
		System.out.println("char at 3rd ps:"+strg24.charAt(3));
		System.out.println("index of r:"+strg24.indexOf('r'));
		System.out.println(strg24.indexOf('r', strg24.indexOf('r')+3));
		
		
		
		String strg6 = " where are u from ";
		System.out.println("the length of string is :" +strg6.length());
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		String greed = "hellorr therehhh";
		System.out.println(greed.indexOf('e', greed.indexOf('e')+2));
		System.out.println(greed.indexOf('h', greed.indexOf('h')+2));
		System.out.println(greed.indexOf('r', greed.indexOf('r')+3));

		System.out.println("-----------------------");

		String strg7 = "hello there who r u";
		System.out.println(strg7.indexOf('e', 2));//find 2nd e
		System.out.println(strg7.indexOf('e', strg7.indexOf('e')+1));// find 2nd e
		System.out.println(strg7.indexOf("who"));//2 nd no. method
		System.out.println(strg7.indexOf("ram sham"));//-1
		String test ="heee pleeo";
		System.out.println(test.indexOf('e', test.indexOf('e')+3));// find  4th e ...srd and 1st

		String bunty ="hello mi piyu"  ;   ///upper case
		System.out.println(bunty.toUpperCase());

		String soni =" HI I AM PREETU";  ///lower case
		System.out.println(soni.toLowerCase());

		//find word
		String strg8 = "hello this is earth";//use index of 2nd type
		System.out.println(strg8.indexOf("earth"));
		System.out.println(strg8.indexOf("this"));
		System.out.println(strg8.indexOf("mango"));

		String strg11="     test test java there       ";
		String  aftertrim = strg11.trim();
		System.out.println( "after treaming spaces :" +aftertrim);
		System.out.println("---------");

		String strg12 ="04/12/1988 ";
		System.out.println("after repalcing : " +strg12.replace('/', '*') );
		System.out.println("after repalcing : " +strg12.replace('/', '#') );
		System.out.println("---------");

		String strg13=" selenium is a liabrary to automate web application";
		
		Boolean checkword = strg13.contains("liabrary");
		
		System.out.println("to check the word liabrary :" +strg13.contains("liabrary") );
		// if (strg13.contains("liabrary"))
		if (checkword) 
		{
			System.out.println("the word liabrary is available");

		}
		else {
			System.out.println(" the word liabrary not avialable");
		}

		System.out.println("---------------");
		String strg14 = "the transaction no. is - 456738234 thanku u";
		String  transno = strg14.substring(25);
		System.out.println("the extracted no. is:" +strg14.substring(25));// 1st
		// System.out.println("the extracted no. is:" +strg14.substring(25, 44));//3rd
		// System.out.println(" the extracted is :" +transno + " thanks for contact");
		System.out.println("----------------");

		String statement1 ="Java is platform independent";
		String statement2 ="java is platform independent";
		String statement3 ="Java is platform independent";
		System.out.println(" is same staments;" +statement1.equals(statement2));
		System.out.println(" is same staments;" +statement1.equals(statement3));
		// with consedering case 1st method 
		if(statement1.equals(statement2))
		{
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equals");
			//ignore case for ignorence upper and lower case

			System.out.println("without considering case:"+statement1.equalsIgnoreCase(statement2));   
		}
		System.out.println("--------------");


		System.out.println("--------------------");
		String strg16 ="java at based on object orientd programming principles"; 
		String [] afterosplit =strg16.split("  ");
		for(int j=afterosplit.length-1; j>=0; j--)
		{
			System.out.println(afterosplit[j] +" ");
		}
		System.out.println("--------------");

		String strg17 ="good&bye&you";
		String[] aftereput = strg17.split("&");
		System.out.println(aftereput[1]+"  "+aftereput[0]+"     "+aftereput[2]);
		//1 0 2 acording to index i want 1,0 den 2


      String st17 ="i m from bhusawal";
      boolean got = st17.contains("from");
      System.out.println(got);
      
      String stat1 ="hello world";
      String stat2 ="hello world";
      String stat3 ="Hello world";
      System.out.println("same sentence are"+stat1.equals(stat3));
      System.out.println("same but ignore casing"+stat1.equalsIgnoreCase(stat3));
      
      String stat ="my mom was my world";
      String wordly = stat.substring(3);
      String worl= stat.substring(0, 1);
      System.out.println(wordly);
      System.out.println(worl);
      
      String welcommen ="welcome to our house";
      String []  come= welcommen.split("  ");
      for ( int p=come.length-1; p>=0;p--){
    	  System.out.println(come[p]);

    	  
      }
    











































				String strg10 = " we are here for you";
		int q[] = new int [5];
		q [0]= 45;
		q [1]= 55;
		q [3]= 75;
		q [3]= 495;
		q [4]= 145;
		for( int u = 0 ;u<= 4; u++)
			System.out.println(q[u]);
		//System.out.println("-------------------");










	}
}
