package session14.constuctor;

public class Employee {
	//for employee clas r variable
	String name;
	int age ;
	String depart;
	int empId;

	static String compaName = "unicorn system";//as it is consatnt
	//this all r comon things
	// creating object of this clas
	public static void main(String[] args) {


		Employee e1 =new Employee();//this below all is we need to write down every so
		//in next clas....
		e1.name = "raj";
		e1.age =30;
		e1.depart="QA";
		e1.empId=101;
		///another object

		Employee e2=new  Employee();
		e2.name = "ram";
		e2.age =36;
		e2.depart="HR";
		e2.empId=102;
		System.out.println("emply 1 info------------");
		//now we need to print  n aceess now ...so
		System.out.println("name"+e1.name);
		System.out.println("age"+e1.age);
		System.out.println("depart"+e1.depart);
		System.out.println("empId"+e1.empId);
		System.out.println("compnay name"+ compaName );
		System.out.println("-------------");

		//now we need to print  n aceess now ...so
		System.out.println("name"+e2.name);
		System.out.println("age"+e2.age);
		System.out.println("depart"+e2.depart);
		System.out.println("empId"+e2.empId);
		System.out.println("compnay name"+ compaName );
		System.out.println("-------------");

		// but if we want to print for 10 employee
		//and it will increse the line of code as well as we need to initiaslise them
		//so it is not proper way
		//so to reduce initialisation(ie above main method)
		//part we have CONSTRUCTOR

	}
}
