package session9;

public class Defaultvalue {
	public static String st;
	public static int i;
	public static double d;
	public static boolean b;
	public static char c;
	public static byte z;
	public static float f;
	public static long l;
	public static void main(String []ar) {
		System.out.println(st);//null is default value
		System.out.println(i);//0
		System.out.println(d);//0.0
		System.out.println(b);//false
		System.out.println(c);// space means nothing
		System.out.println(z);//0
		System.out.println(f);//0.0
		System.out.println(l);//0
		System.out.println("------------");
		//int p = ; //10 ;//local variable....exception..unresolved compilation problem
		//.cos not initialised
	//	System.out.println(p);
		int div1=9/3;
		System.out.println(div1);//3
		int div2=0/3;//0
		System.out.println(div2);
		//int div3= 2/0;  //arithmatic exception it wil not giv ans
		//System.out.println(div3);
		
		int multi = 4*5;
		System.out.println(multi);
		int di= 10/10;
		System.out.println(di);
		int mi= 0/10;
		System.out.println(mi);
//		int si= 10/0;
//		System.out.println(si);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
