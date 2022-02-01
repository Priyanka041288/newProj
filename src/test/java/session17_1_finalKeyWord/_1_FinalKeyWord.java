package session17_1_finalKeyWord;

public class _1_FinalKeyWord {
	public static void main(String []args) {
		//hoe to stop inheritance or pehibate
		int pie =3;
		pie=20;
		System.out.println(pie);//20...cos top to bottom
	
		//if somone write somline code n change value pie to 20..
		//so actull value of or claculation will change..
		//so for  constatnts(like pie)..to avoid thiss we hav keyword final
		//if we dont want change some value..do like this
		final int b=10;//remov final or
		// dont do like this ...b = 20;// it will show excption..unresolved compilation probem...n can not change value
		System.out.println(b);//so final keyword ..is us to make it as a const. sort of entity
		//variable n its value...
		

}
}