package session15;

public class _4testCar {//now we are cheking what we had done
	public static void main(String[] args) {
		System.out.println("-------------------");
		//now we reate bmw objects
		_3BMW B =new _3BMW();//creates obaject of BMW refered by bmw..
		B.stop();//it executes from  car clas..althouth it not present in bmw
		//but bmw extends car
		B.start();//BMW start..cos it is in car.. but in bmw ..it is overide
		B.fillFuel();//car clas
		B.AutoParking();//bmw..clas
		B.engine();//from vehicle clas
		System.out.println("--------------");
		//now we can  crete of car object
		
		_2car c =new _2car();//creates object of car refered by car
		c.start();//it comes from car..  start clas
		c.stop();//car stop
		c.fillFuel();//car fuel
		//can we call engine method...yes
		c.engine();//vehicle..engine
		//can we call c. autoparking...no
		//c.AutoParking     //cant call..we can not go reverse
		System.out.println("----------------------");
		
		//parent      //child
		_2car cb =new _3BMW();//it is call "top  casting"..create object of 
		//child(bmw) refered by parent(car)..we can do like this
		cb.start();//bmw..start...cos priority to overriden method
		cb.stop();//car stop
		cb.fillFuel();//car fuel
		cb.engine();//vehicle ..engine
		//cb.AutoParking..it will not called...cos refering car clas.
		//but in car clas it is not present...it give comman things only ..
		//or only from car clas all can we call
		System.out.println("-----------------");
		
		//grand          //child
		_1Vehicle vb = new _3BMW();//top/up casting
		vb.engine();//vehicle ..engine
		//all are not avaible...cos.. only..common things can call
		
		//DOWN casting
		//_3BMW bc =new _2car();....//it is not possible..parent cannot referd child
		//will give exception
		//wornings..comes in to YELLOW ..and exception in red..this is "compile time exception"
		//./comes in before...run
		
		_3BMW bc =(_3BMW) new _2car();//this is called casting..no error now
		//but now if we run this.. still it give run time ..."clasCastexception"
		//so chek we do wrong casting..we can resolve in compile time casting
		//WHAT IS DIAMOND PROBLEM IN JAVA?
		//TWO PARENT CLASSES EXTENDED ONE CLID CLA ...NO
		//JAVA doesnt support multiple inheritance in terms of clas()at class level
		                     // multi level inheritanve available
		                    //hirarachi n single inneritance available for clas
	}

}
