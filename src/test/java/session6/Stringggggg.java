package session6;

public class Stringggggg {
	public static void main(String []args) {
		String goal = "I want to be a very talented software engg";
		//int finall = +goal.length();
		System.out.println("the length is:"+goal.length());
		System.out.println(" char at 5 th position:"+goal.charAt(5));
		System.out.println("index posn of t:"+goal.indexOf('t'));
		System.out.println("index of posn of t:"+goal.indexOf('t', 2));
		System.out.println("index of 2nd t:"+goal.indexOf('t', goal.indexOf('t')+ 3));
		System.out.println("very word:"+goal.contains("very"));
		if (goal.contains("very")) {
			System.out.println("i got word very");
		}
		else {
			System.out.println("not get");
		}
		System.out.println("upper case:"+goal.toUpperCase());
		System.out.println("lower case:"+goal.toLowerCase());
		String jay = " jai&shree&mataji   ";
		String ans = jay.replace('&', '/');
	//System.out.println("repalce:"+jay.replace('&', '/'));
		System.out.println(ans);
		System.out.println("after exrtract:"+ans.substring(4));
		System.out.println("extracting :"+ans.substring (4,10));
		System.out.println("after trim:"+ans.trim());
		
		
		String nav ="my name is rano";
		System.out.println("lengyj is:");
		
	}

}
