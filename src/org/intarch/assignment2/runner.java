package org.intarch.assignment2;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagePersonalController c = new ManagePersonalController();
		boolean t = c.addSalesman("Shahzeb", "Ali", 9029774);
		if(t) {System.out.println("Recordadded");}
		
	}

}
