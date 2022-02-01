package session15;

public class _2car extends _1Vehicle {///
	//inheritance
	//these are 3 methids for car we creat
	//so for vehicle property in car...
	public void start() {  
		System.out.println("car start");
	}
    public void stop() {
    	System.out.println("car.... stop");
    }
    public void fillFuel() {
    	System.out.println("car...fuel");
    }
    //now how to conect to vehicle which is having method which is engine
    //and we dont want to write once again...cos we r having vehicle clas n
    //we can call it ...so there is keyword in java ie"extends"..means from vehicle 
    //below method is present ...due to extend..but here we no need to write..so coment it
   // public void engine() {
	//	System.out.println("vehicle ....engine");
	}
//inheritance is ...using extend clas.....n overide

