package assignment_2;

public class Question_2 {
	public static void main(String[] args) {
		
		int theDayNoInWeek= 4;//1,2,3,5,6,7
		switch (theDayNoInWeek){

		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		
		default:
			System.out.println("enter no. 1 to 7");
		}
	}

}
