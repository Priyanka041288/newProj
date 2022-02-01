package session19_1_finallynThrowsKeyword;
//this is third way to exception handling
public class _5_throwKeywordExmpl {
	//this is throw not throws
	//1. throw is use to create custom exception by user
	//2.as java not included all type of exception 
	//3.and there will be some cases where user needs to create it own excption
	//acording to specific condition
	public static void main(String[] args) {
//		try {
//			throw new Exception ("user define exception");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("an user defined exceptn thrown due to reason......");
//		}
		//o/p= exception...name..user define exception..after that..an user due to reason
	//-----------------------------------------------------------
		//use case
		//1. while reading out data from excel sheet the cell value gets empty or null
		
//        String username = " ";//if here tom..then o/p is...login with tom //" ";
//		  if(username.equals(" ") || username.equals(null)) 
//		  {
//			  try {
//				  throw new Exception ("blank cell value exception");
//			  }
//			  catch(Exception e) {
//				  e.printStackTrace();
//				  System.out.println("the value fetch from excel sheet cell is either blank or null");
//			  }
//		  }
//		  else 
//		  {
//			  System.out.println("login with ->"+username);
//		  }
		  //--------------------------------------------------------------------
		  launchURL(" ");//("http://www.test.com"); // if we write empty ..means no link(" ")
		  //it will excute try catch
	}
		
		//2.incorrect url exception
		public static void launchURL(String url) {
			if (url.equals(" "))
				try
			{
					throw new Exception("IncorrectUrlException");
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("the entered url value is incorrect");
			}
			else {
				System.out.println("launching the url->"+url);
			}
		}
		
	}
	


