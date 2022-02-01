
package session20_1_Abstraction_2_By_AbstractionClass;

public abstract class _1_Page {
	//can abstract claS be final
	//no..a class can be either abstract or final, not both.
	
	//can abstract class have constructor===YES
	//can create object of abs clas....
	
	//if we r not having abs clas...so we can not create object ..how call constryctor
	//ans== .by  java  ..by creating object of child clas of abstrat cla..or by up casting
	//1 st parent n den child clas cnstructor called automaticly
	
	public _1_Page() {
		System.out.println("page consa..........");
	}
	//abstract not having body..or not implementation
	//means giving our concept to someone else the next person or next clas or creater
	//of next clas..will hav liberty to  add some lgic
	
	public abstract void title();//abstract method//if we create abstrat clas ..one should be abstract method in clas
    public abstract void url(); //abstract method
    public abstract void footerLinks();//abstract  method
    
    public void logo(){
    	System.out.println("page..logo");//non absract method
    }
    
    public final void privacyPolicy()//it can not overide
    {
    System.out.println("page ....privacuPolicy");	
    }
}
//  partial abstr///usion abstact clas-=== 0 to 100% abstraction with abstract clas
//100% abstrction with INTERFERACE