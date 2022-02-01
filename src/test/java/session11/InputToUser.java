package session11;

import java.util.Scanner;

public class InputToUser {
	public static void main(String []args) {
		//already created methods by anyone  for me having some input 
		//n it will manipulate something n giving someoutput
		//i m user for that
		///int a= 10; int b=20; int c=a+b//so we hav e shprt cut
		//by creating object  of that calss by creating anone 
		//UserDefinedMethods refvar=new UserDefinedMethods();
		UserDefinedMethods refvar = new UserDefinedMethods();
		refvar.addPrintOnly(50, 20);//it can call many time n can change values..
		refvar.addPrintOnly(550,20 );
		//we can call any methods.. in diff. clas by creating object
		//in the clas
		
		//supose we have addprint and return both method
		//1st add return..let the say bag is by by me at 100..and 
		//after printing billl that i took 
		//another pen for 20..then they ask for 5 rs gst
		int finaltotal =refvar.addReturn(100, 20);
		//den;
		//refvar.addPrintOnly(finaltotal, 5);//ans wil 125
		//but it wii..create extra var..so we can 
		 //can do like this also
		refvar.addPrintOnly(refvar.addReturn(100, 20),5);
		//this is method inside method...for only addreturn..not for addprint
		
		refvar.addPrintOnly(50, 20);
		//as this is hard coadede we want give some run time value;
	  // so we will create one clas..which is redimade cals from jave
		//we have scannener clas
		//**************************************//
		//ie we learrn how to give input any methid inRUN time.
		//Scanner sc =new Scanner(System.in);//system in means we are giving input
		            // obj of sacner clas
		//scaner is clas take input from user
//		System.out.println("pls enter two values for add");
//	   int intfirst = sc.nextInt();//for integer
//	   int intsecond = sc.nextInt();
//	   sc.close();///need close for scanner 
//	   //now will call method addprint for tthis den , we can give run time value
//	   //den giv evalues in console
//	   refvar.addPrintOnly(intfirst, intsecond);
//	   System.out.println("-----------------");
//	   System.out.println("hey userenter the country name");
//	  Scanner sc1 = new Scanner(System.in);
//	  String inputfrmuser=sc1.next();
//	  sc1.close();//it is for string
//	  //and we want to cal country capital ..
//	  //thiis is string so we save it in string 
//	  refvar.countryCapital(inputfrmuser);//india--ans newdelhi
//	  //usa--ans washington dc
		Scanner sc2 = new Scanner (System.in);
		System.out.println("enter 1st val");
		int y= sc2.nextInt();
		System.out.println("enter 2nd val");
		int z= sc2.nextInt();
		sc2.close();
		int c= y*z;
		System.out.println(c);
		float d= y/z;
		System.out.println(d);
		int e= y-z;
		System.out.println(e);
		int f= y+z;
		System.out.println(f);
		
		
		
		
	}
//we can not write any thing after return
	//in this at a time to program run value can not give..
	//so do 1st comment
}
