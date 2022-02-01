package session8;

import java.util.ArrayList;

public class practiiii {
	public static void main(String []args) {
	ArrayList  ar	 =new ArrayList();
	System.out.println(ar.size());
	ar.add(300);
	ar.add(200);
	ar.add(400)	;
	System.out.println(ar.size());
	ar.add("ranu");
	ar.add('f');
	System.out.println(ar.size());
	for (int i=0; i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	System.out.println("-----------------");
	ar.add(3, 50);
	System.out.println(ar.size());
	System.out.println("----------------------------");
	for(int r=0;r<ar.size();r++) {
		System.out.println(ar.get(r));
	}
	ar.contains(500);
	System.out.println(ar.contains(500));
	//boolean  check = ar.contains(50);
	if(ar.contains(50)) {
		System.out.println("i got no.");
	}
ar.removeAll(ar);
	System.out.println(ar.removeAll(ar));
	ar.isEmpty();
	System.out.println(ar.isEmpty());

	
}
}
