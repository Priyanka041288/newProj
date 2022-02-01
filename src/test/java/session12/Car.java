package session12;

public class Car {
// car is having some name, price, colour
	String name;//but it wii change every time
	int price;
	String colour;
	
	static int wheels=4;//it is static for all cars not change 4 wheels
	//so we hav to create car..so will create object
	public static void main(String[]args) {
		// 1st car
		Car sportsCar =new Car();
		sportsCar.name="bmw";
		sportsCar.colour="sterling black";
		sportsCar.price= 50_000 ;//as int will not"" write this
	                  // giv eunderscore instead of ,
	     System.out.println("------ sports car details---------");
	  //we want to print also..so
	     System.out.println(sportsCar.name);
	     System.out.println(sportsCar.colour);
	     System.out.println(sportsCar.price);
	     //System.out.println(sportsCar.wheels);
	     System.out.println(wheels);
	     System.out.println("------------------");
	     
	     //2nd car..creating objectt
	     Car passangercar =new Car();
	     passangercar.name=" swift";
	     passangercar.colour="white";
	     passangercar.price= 7_00_000;
	     System.out.println("---------swift details--------");
	     System.out.println(passangercar.name);
	     System.out.println(passangercar.colour);
	     System.out.println(passangercar.price);
	     System.out.println(wheels);
	     System.out.println("---------------");
	     
	     
	     
	}
}
