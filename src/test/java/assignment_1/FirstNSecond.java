package assignment_1;

public class FirstNSecond {
	public static void main(String []args) {
		//1 st....
		int a=300;//
		if (a>300)
		{
			System.out.println("a is greater than 300");
		}
		else if(a<300)
		{
			System.out.println("a is less than 300");
		}
		else {
			System.out.println("a is equal to 300");
		}
		System.out.println("--------------"); 
		
		
		// 2nd example
				int billamount=700;// 300 ,500/ 700 /1001
				if (billamount<=300) 
				{	
					System.out.println("ask them for 50Rs tax:" );
				}
				else if (billamount >300 &&  billamount<= 500)
				{
					System.out.println("ask them to 20Rs tax:" );
				}
				else if( billamount>500 && billamount<=1000)
				{
					System.out.println("ask them to 10Rs tax");
				}
				else
				{
					System.out.println("dont take any tax from them");
				}


		
		
	}
}



