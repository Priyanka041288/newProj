package session1;

public class Pract {
	public static void main(String []ar) {
		//data 	types
		int a = 10;
		System.out.println(a);
		double  b = 22.35f;
		System.out.println(b);
		short c =24;
		System.out.println(c);
		float d= 45.67f;
		System.out.println(d);
		long e= 132473;
		System.out.println(e);
		String f= "bhau";
		System.out.println(f);
		char g='s';
		System.out.println(g);
		byte h =2;
		System.out.println(h);
		System.out.println("------------------");
		System.out.println("hey hii everyone ");
		
		///pre post
		int i=3;
		int j=i++; //post inc
		System.out.println(i);//4
		System.out.println(j);//3
		
		int k=3;
		int l=++k; //pri inc
		System.out.println(k);//4
		System.out.println(l);//4
		
		int m=3;
		int n=m--; //post decre
		System.out.println(m);//2
		System.out.println(n);//3
		
		int o=3;
		int p=--o; //pri dec
		System.out.println(o);//2
		System.out.println(p);//2
		
		//string concatination
		int r=10; String x="100";
		int s=30; String y="200";
		System.out.println(r+s);
		System.out.println(x+y);
		System.out.println(x+r);
		System.out.println(r+s+y);
		
		///comparison operator
		int q= 40;
		if(q>50) {
			System.out.println("value is 25");
		}
		else if(q<30) {
			System.out.println("value is 29");
		}
		else {
			System.out.println("insert correct value");
		}
		//while loop print 4 to 9
		int  v= 4;
		while (v<=7) {
			
			System.out.println(v);
			v++;
			System.out.println("------------------");
		//do while loop//5 to 15
		int u= 5;
		do {
			u++;
			System.out.println(u);
		
			
		}
		while (u<=15);
		System.out.println("-------------------");
		
		//for loop 
//		int w=5;
//		for(int z=25; z<=30 ; z++) {
//			System.out.println(z);
//		}
		//switch case
		String std = "riya";
		switch(std)
		{
		case" brayo":
			System.out.println("now i m completed brayo");
			break;
		case" joyo":
			System.out.println("now i m completed joyo");
			break;
		case "johm":
			System.out.println("now i m completed 35");
			break;
		case "sanny":
			System.out.println("now i m completed 38");
			break;
		case "riya":
			System.out.println(" i m riya");
			break;
		default:
			System.out.println("enter correct name");
			break;
		}
		
	}

}
}