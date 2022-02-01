package session12;

public class StaticAndNonStatic {
	//data members of class = variables, methods
	//variable
	String name;//non static- variabale 
	static int age = 25;//static-variable// as it is static it is initialised 
	//methods
	public void getname()
	{
		System.out.println("get the name");
	}
	public static void getstart()
	{
		System.out.println(" let get start");
	}
	public static void main(String[] args) {
		//for calling static method 3 ways in same clas
		// way 1.directly by method name.. as we r in same clas 
		//------for static---------
		getstart();//directly
		System.out.println(age);//directly
		System.out.println("-----------------------------");

		// way 2.by clasname//
		StaticAndNonStatic var =new StaticAndNonStatic();
		var.getstart();
		System.out.println(var.age);// if nae-null as value of name is not given
		//var.age;
		System.out.println("----------------");

		// way 3. by classname.//3rd way should be prohibited
		StaticAndNonStatic.getstart();
		System.out.println( StaticAndNonStatic.age);
		System.out.println("------------");

		// /---------for non static-----variabale n method-----1way only
		StaticAndNonStatic objref =new  StaticAndNonStatic ();
		objref.getname();
		//objref.name= "dipu";// it rwritern after//den output will get dipu
				
		System.out.println(objref.name);//null-it gives null
		System.out.println("------------------");
		//all above is just calling and declaration;
		
       // can we call or acess data members ie  static(variable and methods) directly
		// by  an object without creating objectrefrenc =====YES	
		
		new  StaticAndNonStatic ().getstart();//cos at this point object is created
		System.out.println(new  StaticAndNonStatic ().age);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		new  StaticAndNonStatic ().getname();
		System.out.println(new  StaticAndNonStatic ().name="peetu");
		System.out.println("---------------------------");

      // creating an object again 
		StaticAndNonStatic objref1 =new  StaticAndNonStatic ();
		objref1.getname();//this is regular stuf//get the name
		objref1= null;//we can not giv any name
		objref1.getname();//output wiil giv enullpoint eception java.lang package
		//after null anything objref1.;;;;will not print



	}

}
