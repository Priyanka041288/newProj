package session2;

public class IncrementDecrementoperator {
	
	public static void main(String[]a) {
		//post increment
		int i= 1;
		int j = i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		
		//Per increment
		int k= 3;
		int l= ++k;
		System.out.println(k);
		System.out.println(l);
		System.out.println("---------------");
		
		//post increment
		int m=-2;
		int n= m++;
		System.out.println(m);
		System.out.println(n);
		System.out.println("---------------");
		
		//post decrement
		int p=-3;
		int q=p--;
		System.out.println(p);
		System.out.println(q);
		System.out.println("----------------");
		
		//per decrement
		int u = -2;
		int v = --u;
		System.out.println(u);
		System.out.println(v);
		
		int u1 = -3;
		int v1 = u1--;
		System.out.println(u1);
		System.out.println(v1);
				
		
		
	}
}
