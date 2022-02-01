package session16_Encapsulation;

public class _1_Company {
	///opps concept as an acess modifier..
	
public String name ;///we can expose to all...or any outside comp.
public String logo ;
public int EmpCount ;
private String searchEngine ;//we dont want to expose to outside company
private int revenue;//this also..thts why private//these 2 methods cant use outside class..

//getter and setter
//we create method for initialise...for variable.
// ENCAPSULATION means--hiding up  the isential stuff..and only exposing whic is needed to expos

public String getname() {//geting vari...//print-+
	return name;
}
public void setname() {//setting variable
	this.name=name;
}
public String getlogo() {
	return logo;
}
public void setlogo() {
	this.logo= logo;
}
	
	
	
	
		public int getEmpCount() {
			return EmpCount;
		}

		public void setEmpCount(int empCount) {
			int addMoreEmp = 10 + empCount;
			EmpCount = addMoreEmp;
		}

		public String getEngine() {
			return searchEngine;
		}

		public void setEngine(String searchEngine) {
			this.searchEngine = searchEngine;
		}

		public int getRevenue() {
			return revenue;
		}

		public void setRevenue(int revenue) {
			this.revenue = revenue;
		}

}



