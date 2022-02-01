//swap two no.means interchanging the value of variable
public class SwapingTwonos {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("before swapping :"+a +" " +b);
		//1 st logic = we use third variable
		//		int t=a;
		//		a=b;
		//		b=t;
		//		System.out.println("after swaping :"+a+ " " +b);
				
		//		//logic 2= using + and - operator...wiyhout 3 rd var 
		//		a=a+b;//10+20=30
		//		b= a-b;//now a is 30...so..30-20=10
		//		a=a-b;//now b is 10...so..30-10=20
		//		System.out.println("after swaopping:"+a+" "+b);
				
		//logic 3=using * and /,without using 3rd var
		//a n b should not be 0		
		//	a=a*b;//10*20=200
		//	b=a/b;//now a is 200..so 200/20=10
		//	a=a/b;//now b is  10..so...200/10=20
		//	System.out.println("after swapping:"+a+" "+b);
			
        //logic 4= bitwise XOR operator (ie ^)
//		a=a^b;//30
//		b=a^b;//10
//		a=a^b;//20
//		System.out.println(+a+" " +b);
		
		//logic 5=with single sttement
		b=a+b-(a=b); //execution from rite to left
		System.out.println(+a+" "+b);
		
//	int c=40,d=50;
//		System.out.println("before swapping:"+c+" "+d);
////		c=c+d;//40+50=90
////		d=c-d;//now c is 90....so 90-50=40
////		c=c-d;//now d =40....90-40=50
////		System.out.println("after swapping:"+c+" "+d);
////		
//	
//		 int e=c;
//		c=d;
//		d=e;
//		System.out.println("after "+c+" "+d);
		
		//logic 4= bitwise xORoperator (ie ^)
		

	}
}