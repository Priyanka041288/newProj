package session13;

public class _3_OverLoading {
	public static void main(String[] args) {
		System.out.println(" hay");
		//interview quetion--can we create another main method, overloaded main 
		//method...we can static methods also get overloaded,
		//  can overload  main method
		main(10);//every method wil have diff. logic
		main(10,20);//due to static we call direct using main
	}
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
//for static mrethod we dont make object, but we can cal main method directly
	//question---if we run above which  method will run--1st will run
	//if we want to call another 2 then they should be under main method 1 st
	//ie in main (10), and main(10,20), call in main method
}
