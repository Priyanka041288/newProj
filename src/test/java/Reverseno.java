import java.util.Scanner;

public class Reverseno {
	public static void main(String[] args) {
		//reverse the no.s
		
		//logic 1st==input from user
		Scanner  sc= new Scanner (System.in);
//		
        System.out.println("enter a no.");
		int num =sc.nextInt();///12345 
		
//		//using algorithm
//		int reverse =0;
//		while (num!=0) {
//			reverse=reverse*10 + num%10;
//			num=num/10;
//		}
//		System.out.println("rever. no. is:"+reverse);
		
//		//using string buffer clas...ter is no logic we can directly reverse
		//using string buffer clas
		StringBuffer sb =new StringBuffer ( String.valueOf (num));//we convert
		//num in to string format by upper
		StringBuffer rev=sb.reverse();
		System.out.println("rever. no. is:"+rev);
		
		
		
	}

}
