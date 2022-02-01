package session11;

public class SystemMethods {//java methods
	static String massage ="      hey ther      ";
	public static void main (String []args) {// count the length of string
		
		System.out.println("the length of string is:"+massage.length());
		//remove the  white spaces from front n back
		
		System.out.println("after removing spaces:" +massage.trim().length());
		//abov eis after removing spaces length of string is
		//its called methode chaining.....not worked every time
		
		//input type of length is string
		String newmsg = massage.trim();
		System.out.println(newmsg.length());
		
		//now original topiv
		String greed ="                  good day           ";
		System.out.println("length of string :"+greed.length());
		System.out.println("after removing spaces:"+greed.trim().length());
	}
	

}