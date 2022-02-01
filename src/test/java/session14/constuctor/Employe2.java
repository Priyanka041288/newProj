package session14.constuctor;

public class Employe2 {
	String name;
	int age ;
	String depart;
	int empId;

	static String compaName = "unicorn system";//as it is consatnt
	
	//constructor is a way to  get called when we create nan objet
	//points
	//1.constructor will hav no return type
	//2. it is same name as clas name
	//3.if not provided constructor.. java will provide it internally
	//types of constructr====
	//1. default
	//2. userdefined(a. zero parameter ans  b. with parameters)
    //3.constructor could be overloaded(overloding can be takes place in a same clas)
	
	//create  constructor ..so we hav to rite
	public  Employe2() //this is zero parameter constructor -user defined
	{
		System.out.println("zero parameter constructor");
	}
	public  Employe2(int i)//1 parameter constructot
	{
		System.out.println("one para constructor "+i);
		
	}
	public  Employe2( String s)//1 par (overloded) constructor
	{
	System.out.println("one para constructor"+s);
	}
	//create a conctr with all variable we r tring to initialise
	public  Employe2(String name1,int age1, String depart1,int  empId1)
	///these variables in bracket are differsrnt 
	//these r only for this perticulr constructor
	{
		//name =name1;  /// now here we should write for not confuse write like name= name1 
		// should use same   so  ....name = name  ... but java  get confused.. so use... 
		//this keyword..so it will be
		this.name= name;// we can asign this way...
		 this.age= age;// by using this keword we can refer a class variable.. 
		 this.depart= depart;// so to avoid un neccesary name1 , age1..use "this" keyword
		this.empId= empId;
		///so how many times will do this 
	}
		
//		//so if we want only 2 var. is to be initialise
	public Employe2 (String name1, int empId1){//this name1 is different from above
		//here this only for this constructor
		
		//name=name1;
		this.name=name;
		//empId = empId1;
		this.empId = empId;
		
}
	public static void main(String[] args) {
		System.out.println("----zero para---------------");
		//creating object
		//constructor
		Employe2 e0 =new  Employe2 ();//ans- zero para const...wil cal
	//typeofvar  refvar   object  and  ..Employee()=constructor of the clas
		 //if we not write it..java will implicitly cal it n we cant able to see it
		System.out.println("--------one para--------------"); 
		Employe2 e1 =new  Employe2 (10);//1 para cons--int ..wil cal
		Employe2 e2 =new  Employe2 (" thoms ");//1 para -string ..wil cal
		System.out.println("--------------------------------------");
		
		Employe2 e3 =new  Employe2("jelf", 35, "admin", 102);
		Employe2 e4 =new  Employe2("harry", 42, "QA", 102);
		Employe2 e5 =new  Employe2("jenilia",30, "HR", 102);
		System.out.println("----------------");
		System.out.println(e3.name+" "+e3.age+" "+e3.depart+" "+e3.empId+" "+compaName);
		System.out.println(e4.name+" "+e4.age+" "+e4.depart+" "+e4.empId+" "+compaName);
		System.out.println(e5.name+" "+e5.age+" "+e5.depart+" "+e5.empId+" "+compaName);
		//instead of writing 3,4 lines..like below.....we return in one line like above
//	
		
//		SO BY CREATING ONLY ONE CONST BElow
//		public  Employe2(String name1,int age1, String depart1,int  empId1);
//		name =name1;
//		age= age1;
//		depart= depart1;
//		empId= empId1;
		//reduces code
		Employe2 e6 =new  Employe2("max", 108);      //this is for 48 to 52 line
		System.out.println("for newly joined employee"+ e6.name+" "+e6.empId+" "+compaName);
	}
	//in constructor heraarchi = 1 . java     2. user= a. zero para    b. with parameter(1,2,3,4
	
	
}
	
	
	



