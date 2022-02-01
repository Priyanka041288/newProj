package session8;

import java.util.ArrayList;

public class _2arraylistGenericTyepe {
	public static void main(String []a) {
		//declaring it
		ArrayList ar = new ArrayList();// imort by hovering after writing arraylist
		System.out.println(ar.size());
		System.out.println(" 1.size of array before something store in  it:" +ar.size());

		ar.add(100);//we can any dtata types//0
		ar.add(200);//1
		ar.add("test");//2
		System.out.println(" 2.after adding some values in arraylist:"+ar.size());
		//length()for string,length- array, size-arrylist 
		ar.add(500);//3
		ar.add(800);//4
		System.out.println(" 3.after adding some values in arraylist:"+ar.size());
		for(int i=0;i<ar.size();i++) {
	    System.out.println(ar.get(i));//for whole values of array list

		}
		//generic it means restriction to perticulR DATA types
		//in abov we add int with string..now if we want restrivct
		//one perticular data type den put that type in <>
		 ArrayList <String> ar2=new ArrayList <String> ();
		 ar2.add("ranu");
		 ar2.add("sonu");
		 ar2.add("buntu");
		// ar2.add(500);//it will not add cos 500 is int we resrict
		 System.out.println(ar2.size());
		 for (int j=0; j<ar2.size();j++)
		 {
			System.out.println(ar2.get(j)); 
		 }
		 System.out.println("------------------------------");
		 ArrayList <Integer>ar3 = new ArrayList <Integer>();
		 // in this we can not use short cuts of data types only full form
		 // ie Integer, Character, String , Float, Double ...not int char 
		 ar3.add(100);//0
		 ar3.add(800);//1
		 ar3.add(500);//2
		 ar3.add(300);//3
		 System.out.println(ar3.size());
		 System.out.println(ar3.get(0));//for perticular index no. to print
		 //System.out.println(ar3.get(5));//it will show "IndexoutOfBoundException"
		 System.out.println("------------------------");
		 //arraylist of object type
		 ArrayList <Object> ar4= new ArrayList <Object>();
		 ar4.add("sonu");
		 ar4.add(38);
		 ar4.add(true);
		 System.out.println(ar4.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
