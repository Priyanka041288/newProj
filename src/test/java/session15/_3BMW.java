package session15;

public class _3BMW extends _2car {
	//for this car manifacturer...car can start.. stop..but bmw said 
	//we need key ..that directly start car..is.. in different way it shoud satrt..
	//so we will create again satrt method for bmw
	
	@Override    //.....write for understand to others
	//overriding in diff. clas with "extends" keyword....its called "inheritance"
	///overloading in same clas..
	
	public void start() {//here we r OVERRIDDEN this method..cos..method is same in both clas
	//different feature for satrt.
		System.out.println("BMW... start"); 
	}
	//
	//so itrs our choice which should be called..this or from car clas
	
	//if  i tri to write Overrride here..it will show error
	
	public void start(int a) {//this is not overriding...cos.. here ther is not vilable in
		//in parent cals that is car class....
		System.out.println("BMW .. start limited addition");
	}
//	now... car having 3 methods ..but bmw having its own  feature ...
	//independent method for bmw
	public void AutoParking() {
		System.out.println("BMW.....auto parking");
		//this is apart from car..car having generic
		
	}

}
