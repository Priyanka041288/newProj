package session4;

public class Dowhileloop {
	public static void main(String[] args) {
		
	//used for (print 10 to 20)
		int i= 10;// start point
		do {
			System.out.println(i);
			i++;//if we return beforesyso ans will from 11
			
			//  do execute atleast ones if satisfi or not stisfied still
		}
		while(i<=9);//condition  check
		//(i<=9)
		
		
		int a= 25;
		while (a<=35) {
			System.out.println(a);
			a++;
		}
		
		int b= 45;
		do {
			b++;
			System.out.println(b);
			
		}
		while(b<=55);
	
	
	for (int c=100;c<=120;c++ ) {
		System.out.println(c);
	}
	String student = "didu" ;
	switch (student){
	case "moni":
		System.out.println("her name is moni");
		break;
	case "ranu":
		System.out.println("her name is ranu");
		break;
	case "didu":
		System.out.println("her name is didu");
		break;
	case "bunty":
		System.out.println("her name is bunty");
		break;
	case "deepika":
		System.out.println("her name is deeapika");
		break;
	default :
	 System.out.println("entr correct student name");
		
	}
	
	

}
}