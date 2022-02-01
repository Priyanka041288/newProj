package session21;

public interface _3_indianMedical extends _0_WHO {
	public void emergencyServices();//abstract (prototype method)
	
	public void neuroServices();//abstract (prototype method)
	
	public void peditricServices();//abstract (prototype method)
	
	public void RadiologyServices();//abstract (prototype method)
	//common services also available in other interface
	
	public static void dengueServices() {
		System.out.println("Indian .......dengueServices");
	}
	
	//interface is used to create only rule or method name..which is unimlpimanted
	
	
	
	

}
