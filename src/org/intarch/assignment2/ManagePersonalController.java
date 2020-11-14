package org.intarch.assignment2;

public class ManagePersonalController {

	ManagePersonalService managePersonal = new ManagePersonalService();
	
	//addSalesman Controller
	public boolean addSalesman(String firstname, String lastname, Integer id) {
		SalesMan s = new SalesMan(firstname, lastname, id);
		managePersonal.createSalesMan(s);
		
		if(managePersonal.readSalesMan(id)!=null) {
			return true;
		}
		return false;
	}

}
