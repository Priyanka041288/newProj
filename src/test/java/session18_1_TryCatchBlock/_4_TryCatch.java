package session18_1_TryCatchBlock;

public class _4_TryCatch {
	//now
	static int x=9;//if we hav 2 diff no..and having method in a int b
	//iy might be another also exception while doing div
	static int y=(Integer)null;//if by mistske null we can not write null diectly instd 0..so (Integer)null write this way//null ex
	//so there r 2 exception handle
	//so for that 1 try multi catch
	public static void main(String[] args) {
		_4_TryCatch tc =new _4_TryCatch();
		tc.division (x,y);
		
	}
	public void division(int a,int b) {
		//one try with multiple catch blocks
		try
		{
			int c=a/b;
			System.out.println("divion of input "+a+"and"+b+"is:" +c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();//will give prper herarchy from wher excpn coming
			System.out.println("an exception ocur in div method");// user defined msg for more clarification
		
		}
		catch(NullPointerException e) {
		    e.printStackTrace();//will give prper herarchy from wher excpn coming
		    System.out.println("exc ocur other than nullpointr exception inside div method ");// user defined msg for more clarification
		}
		catch(Exception e) {
			e.printStackTrace();//will give prper herarchy from wher excpn coming
			System.out.println("exc ocur other than arith exception inside div method");// user defined msg for more clarification
			
		}
		//in try can use try catch...in catch also we can use try catch
		
	}

}
