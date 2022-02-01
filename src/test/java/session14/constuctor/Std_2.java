package session14.constuctor;

public class Std_2 {
	String name ;
	 int age;
	 String branch;
	 double height;
	 
	 static String SchoolName ="knv";
	 
	public Std_2() {
		System.out.println("this is zero para constructor");
	}
	public Std_2(int u) {
		System.out.println("this is one para constuctor"+u);  
	}
	public Std_2(String s) {
		System.out.println("this is one para is"+s);
		
	}
	public Std_2(int age,String name,double height,String branch) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.branch=branch;
		
	}
	public Std_2(int age, String name) {
		this.name=name;
		this.age=age;
	}
	public static void main(String[]args) {
		Std_2 st0 = new Std_2();
		System.out.println("----zero para---");
		Std_2 st1 = new Std_2(10);
		Std_2 st2=new Std_2 ("preeti");
		
		Std_2 st3=new Std_2(36,"ranu", 5.1 , "mech");
		Std_2 st4=new Std_2(46,"sanu",5.8,"civil");
		Std_2 st5=new Std_2(56,"monu",5.8,"electrical");
		Std_2 st8=new Std_2(66,"monu",5.9,"electrical");
		System.out.println("---------------");
		System.out.println(st3.age+" "+st3.name+"  "+st3.height+" "+st3.branch+" "+SchoolName);
		System.out.println(st4.age+" "+st4.name+"  "+st4.height+" "+st4.branch+" "+SchoolName);
		System.out.println(st5.age+" "+st5.name+"  "+st5.height+" "+st5.branch+" "+SchoolName);
		System.out.println(st8.age+" "+st8.name+"  "+st8.height+" "+st8.branch+" "+SchoolName);
		System.out.println("------------------");
		Std_2 st6= new Std_2(25,"ram");
		System.out.println(st6.age+" "+st6.name+" "+SchoolName);
	}
}

