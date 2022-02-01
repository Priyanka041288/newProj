package session7;

public class Arrays {
	public static void main( String[]a) {
	 
		int i=10;
		i=20;
				System.out.println(i);
		
		i=30;
		System.out.println(i);
		System.out.println("----------------");
		
		int []q= new int [4];// 0 1 2 3
		int y[]= new int [3]; // 0 1 2
		int[] x =  new int [5];//0 1 2 3 4
		
		int z[]= { 20, 30, 40,50,60};
		           //0   1   2  index position
		for( int count= 0; count<= 4; count++)
		{
			System.out.println(z[count]);
		}
		
		int u[]= { 20, 30, 40, 50, 60};
                   //0   1   2  index position
      for( int k= 0; k<= 4; k++)
     {
	   System.out.println(u[k]);
      }
      System.out.println("--------------");
      
      q[0]= 12;//foe  1st explanatio [] q
      q[1]= 22;
      q[2]= 32;
      q[3]= 42;
      
     for ( int l=0 ;l<=3; l++)
     {
    	System.out.println(q[l]) ;//
     }
     System.out.println("------------");
      //check whetthr no 66 is preent in the given array 
     int test[]= new int [3];//0 1 2
     test[0]= 33;
     test[1]= 44;
     test[2]= 66;
     
     for (int v = 0 ; v<= 2; v++)
     {
    	 if(test [v]==66) {
    	 System.out.println( "i found no.66");
     }
    //	 else {
    	//	 System.out.println(" 66 is not present");//we can delet this else statement
    	// }
    }
     System.out.println("----------------");
     System.out.println("----------------");
     //array of double,int
     double k1[]= new double [7];
     k1[0]=22.22;
     k1[1]=24.22;
     k1[2]=28.22;//if we delet its value comes 0.0 ie default value
     k1[3]=32.22;
     k1[4]=34.22;
     k1[5]=44.33;
     k1[6]=55.22;//if we put n<7 it we show exception.
     for(int n=0; n<k1.length; n++)// this lenght is keyword and length() this is function
     {
    	 System.out.println(k1[n]);
    	 
    	 //System.out.println(k1[8]); it will give array indexout of bound exception
     }
     //array of string
     String browser[]= new  String[4];
      browser[0] =" chrome";
      browser [1]= "edge";
      browser [2]=" opera";
      browser [3]=" firefox";
     for(int k2=0; k2<=3;k2++) {// k2< browser.length
    	 System.out.println(browser[k2]);//if want to print chrome found or any den give
    	 //if condition
     }
     System.out.println("------------------");
     for (int j1=3;j1>=0;j1--)//for increase string den we can put
    	 //j1=browser.length-1
     {
    	 System.out.println(browser[j1]);
     }
     //name, age , salary ,gender ,is married= mix data types
     Object emp []=new Object [5];
     emp[0]="deepu";//string
     emp[1]="36";//int
     emp[2]="500.44";//double
     emp[3]="m";//char
     emp[4]="true";//boolean
     for (int k3=0;k3<emp.length;k3++) {
    	 System.out.println(emp[k3]);
     }//or we can write as
     Object emp23[]= {"ranu", 33,200.45,'f',false};
     for(int k4=0; k4<emp23.length;k4++) {
    	 System.out.println(emp23[k4]);
     }
     
     long carcharge []=new long [6];
     carcharge[0]=43467;
     carcharge[1]=43457;
     carcharge[2]=43487;
     carcharge[3]=43497;
     carcharge[4]=43667;
     carcharge[5]=43567;
     for(int k5=0;k5<=5;k5++) {
    	 System.out.println(carcharge[k5]);
     }
     
     long houpice[]= {1234,2345,1243,1244};
     for (int k10 =0;k10<houpice.length;k10++) {
    	 System.out.println(houpice[k10]);
     }
     short capcity []= {2,3,4,5,6};//gb
     for(int k6=0;k6<capcity.length;k6++) {
    	 System.out.println(capcity[k6]);
     }
     String []std =new String [5];
     std [0]=" ranu";
     std [1]=" sonu";
     std [2]=" tanu";
     std [3]=" manu";
     std [4]=" anu";
     for (int c=std.length-1;c>=0;c--) {
    	 System.out.println(std[c]);
     }
     
    String nam []= new String [5];     
     nam[0]="preeti";
     nam[1]="preet";
     nam[2]="pree";
     nam[3]="pre";
     nam[4]="pr";
     for (int s=nam.length-1;s>=0;s--) {
    	 System.out.println(nam[s]);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

}
}