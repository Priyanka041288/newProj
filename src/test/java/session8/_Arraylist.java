package session8;

import java.util.ArrayList;
import java.util.Iterator;

public class _Arraylist {
	public static void main(String[]arg)
	{
		ArrayList ar = new ArrayList();// imort by hovering after writing arraylist
		System.out.println(ar.size());
		System.out.println(" 1.size of array before something store in  it:" +ar.size());
		System.out.println("-----------------------------");

		ar.add(100);//we can any dtata types//0
		ar.add(200);//1
		ar.add("test");//2
		System.out.println(" 2.after adding some values in arraylist:"+ar.size());
		//length()for string,length- array, size-arrylist 
		ar.add(500);//3
		ar.add(800);
		System.out.println(" 3.after adding some values in arraylist:"+ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));//for whole values of array list

		}

		//Arraylist <String> ar2=new Arraylist <String>();


		System.out.println("the value at 2nd index position for arraylist:"+ar.get(2));
		//for perculR index position
		System.out.println("the value at 4th index position for arraylist:"+ar.get(4));
		System.out.println("-----------");
		//fresh arraylist
		ArrayList ar1 = new ArrayList();
		ar1.add(101);//0
		ar1.add(102);//1
		ar1.add(103);//2
		ar1.add(104);//3
		ar1.add(105);//4
		System.out.println("the size of ar1 is:"+ar1.size());//5
		for( int k=0;k<ar1.size();k++) {;
		{
			System.out.println(ar1.get(k));
		}
		}

		//		ar1.remove(1);
		//		System.out.println("after removing 1 st the size is:"+ar1.size());//4
		//		for( int k=0;k<ar1.size();k++) {;
		//		{
		//			System.out.println(ar1.get(k));
		//		}
		//		}
				
		//		{
		//			System.out.println(ar1.get(k));
		//		}
		//		}
		ar1.add(2, 109);//change in above 2nd index -109
		System.out.println("----------");
		System.out.println("the size of ar1 is:"+ar1.size());//add 1 extra on 2ndand 2nd get 3rd
		for( int k=0;k<ar1.size();k++) 
		{
			System.out.println(ar1.get(k));
		}
		System.out.println("-----------");
		ar1.contains(105);// to find 105 in list
		System.out.println(ar1.contains(105));

		boolean validatevalue101 =  ar1.contains(101);
		if( validatevalue101) {
			System.out.println("yes i got it");
		}
		System.out.println(validatevalue101);
		System.out.println("------------------------");
		System.out.println("check ar1 is empty:"+ar1.isEmpty());

		ar1.clear();
		System.out.println("now, after clearing the value of ar1 is:"+ar1.size());//all clear ans 0
//		for( int k=0;k<ar1.size();k++) {;
      
		




      ArrayList ar4 = new  ArrayList();
      System.out.println("size of arraylist"+ar4.size());
      ar4.add(900);
      ar4.add("tanu");
      ar4.add(22.55);
      System.out.println("size of arraylist"+ar4.size());
      ar4.add('p');
      System.out.println("size of arraylist"+ar4.size());
      for (int b =0; b<ar4.size();b++) {
    	  System.out.println(ar4.get(b));
      }
      System.out.println("the size is "+ar4.size());
      ar4.remove(3);
      for (int b =0; b<ar4.size();b++) {
    	  System.out.println(ar4.get(b));
      } System.out.println("the size is "+ar4.size());
     
      ar4.add(3, 200);
      for (int b =0; b<ar4.size();b++) {
    	  System.out.println(ar4.get(b));
      }
      System.out.println("the size is "+ar4.size());
      
      
      ar4.contains(22.55);
      if(ar4.contains(22.55)) {
    	  System.out.println("it conttains value");
      }
      else
      {
    	  System.out.println("not contain");
      }
      ArrayList<String> ar5 =new ArrayList <String> ();
      
      
      
      
      




















	}
}