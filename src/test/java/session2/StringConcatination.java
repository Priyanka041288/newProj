package session2;

public class StringConcatination {
	public static void main(String[]args) {
		//string concatenation
		String x = "100";
		String y = "300";
		
		String a = "test";
		String b = "selenium";
		
		int c = 200;
		int d = 400;
		
		System.out.println(x);//100
		System.out.println("X");//X
		System.out.println(x+y);//100300
		System.out.println(x+a);//100test
		System.out.println(a+b);//testselenium
		System.out.println(a+c+d);//test200400
		System.out.println(c+d);//600
		System.out.println(x+d);//100400
		System.out.println(b+(c+d));//selenium600
		System.out.println(c+d+b);	//600selenium
		System.out.println("--------------------");
		
		int bill= 600;
		int tax= 70;
		 int total=bill+tax;
		System.out.println(  total);
		System.out.println("the total amount is :" +(bill+tax));
		System.out.println("------------------------");
		
		//character concatenation
				char c1 = '5'; int z1 = 5;//chart value of
				char c2 = '4'; int z2= 4;
				char c3= 'A' ; 
				char c4 ='B' ;  String s2 = "B";
				System.out.println( c1+ c2);
				System.out.println(z1+z2);
				System.out.println(c1+c3);
				System.out.println(c3+c4);
				System.out.println(c1+s2);
				int x1=2;
				int x2= 3;
				int y1= x1+x2;
				System.out.println(" the total is "+(x1+x2));
				//directly x1+x2
				System.out.println(y1);
}

}
