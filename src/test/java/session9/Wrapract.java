package session9;

public class Wrapract {
	public static void main(String[] args) {
		System.out.println("string to integer");
		String aa = "100";
		int bb = 500;
		System.out.println(aa+bb);
		System.out.println("-------------------");
		String cc="700";
		int dd=600;
		System.out.println(cc+dd);
		System.out.println("---------------");
		String price = "900";
		int charge= 100;
		int convtval= Integer.parseInt(price);
		System.out.println("total is"+(convtval+charge));
		System.out.println("---------------------------");
		System.out.println("ineger to string");
		int ee=2000;
		String ff = "200";
		System.out.println("total is"+(ee+ff));
		String conval =String.valueOf(ee);
		System.out.println( ( conval+ff ));
		System.out.println("-------------------");
		System.out.println("string to double");
		String mem ="12.5";
		double i = 23.4;
		double memsiz = Double.parseDouble(mem);
		System.out.println(memsiz+i);
		
		//$500+600rs using replace
		String value ="$500";
		int extra =600;
		//we need to first remov dollar sign...so..
		String value1 = value.replace('$', '0');
		System.out.println(value1);
		int convalu = Integer.parseInt(value1);
		System.out.println( "finw value is" +(convalu+extra));
		///using substring
		String value2 ="$500";
		int extr =600;
		String value3 =value2.substring(1);
		System.out.println(value3);
		int newval = Integer.parseInt(value3);
		System.out.println( "the ans will be"+(newval+extr));
		
//		String sharp= "come the time";
//		String sharp1[] = sharp.split("  ");
//		for (int k=sharp1.length-1; k>=0; k--) {
//			System.out.println(sharp1.charAt[k]);
//		}
		
		
		
		
		
		
		
	}
}
