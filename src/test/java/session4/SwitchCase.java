package session4;

public class SwitchCase {
	public static void main(String[]a) {
		//used to chek multiple conditions
		//more faster in terms of execution
		//ex 1
		int num = 6;
		//		if (num==1)
		//		{
		//			System.out.println("num. is one");
		//		}
		//		else if (num==2)
		//		{
		//			System.out.println("num. is two");
		//			
		//		}
		//		else
		//		{
		//			System.out.println("plz enter no. within 0 to 9");
		//		}

		//switch case
		switch (num)
		{
		case 0:
			System.out.println("num is zero");
			break;

		case 1:
			System.out.println("num is one");	
			break;

		case 2:
			System.out.println("num is two");	
			break;

		case 3:
			System.out.println("num is three");	
			break;

		case 4:
			System.out.println("num is four");	
			break;

		case 5:
			System.out.println("num is five");	
			break;

		default:
			System.out.println("enter no. from zero to five");
		}
		//
		int digit =2;
		switch (digit) {
		case 0:
		case 1:
			System.out.println("hello");
		case 2:
		case 3:
			System.out.println("hii");
		default:
			break;
		}
		//chrome , opera and edge only not safari
		String browser ="chrome";//abcd den defalult satisfy try for char
		switch (browser) {
		case "chrome":
			System.out.println("launching up chrome");
			break;
		case "opera":
			System.out.println("launching up opera");
			break;
		case "edge":
			System.out.println("launching up edge");
			break;
		default:
			System.out.println("plz enter only  chrome, opera, edge");
			break;




		}
	}
}






























