package org.intarch.assignment2;

import org.bson.Document;

public class EvaluationRecord {
	final private int targetValue=4;
	private int sid;
	private int leadershipCompetence;
	private int opennessToEmployees;
	private int socialBehaviourToEmployee;
	private int attitudeTowardClients;
	private int communicationSkills;
	private int IntegrityToCompany;
	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setYear(int year) {
		this.leadershipCompetence = year;
	}

	public void setNameOfProduct(int opennessToEmployees) {
		this.opennessToEmployees = opennessToEmployees;
	}

	public void setClient(int socialBehaviourToEmployee) {
		this.socialBehaviourToEmployee = socialBehaviourToEmployee;
	}

	public void setClientRanking(int attitudeTowardClients) {
		this.attitudeTowardClients = attitudeTowardClients;
	}

	public void setItems(int communicationSkills) {
		this.communicationSkills = communicationSkills;
	}

	public void setBonus(int bonus) {
		this.IntegrityToCompany = bonus;
	}



	public EvaluationRecord(int leadershipCompetence, int opennessToEmployees, int socialBehaviourToEmployee, int attitudeTowardClients, int communicationSkills, int IntegrityToCompany) {
		super();
		this.leadershipCompetence = leadershipCompetence;
		this.opennessToEmployees = opennessToEmployees;
		this.socialBehaviourToEmployee = socialBehaviourToEmployee;
		this.attitudeTowardClients = attitudeTowardClients;
		this.communicationSkills = communicationSkills;
		this.IntegrityToCompany = IntegrityToCompany;
	}

	public Document toDocument() {
		
        org.bson.Document document = new Document();
        document.append("targetValue" , this.targetValue);
        document.append("sid" , this.sid);
        document.append("year" , this.leadershipCompetence );
        document.append("nameOfProduct" , this.opennessToEmployees );
        document.append("client" , this.socialBehaviourToEmployee );
        document.append("clientRanking" , this.attitudeTowardClients );
        document.append("items" , this.communicationSkills );
        document.append("bonus" , this.IntegrityToCompany );
        
        return document;

	}

}
