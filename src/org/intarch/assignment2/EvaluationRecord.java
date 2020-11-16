package org.intarch.assignment2;

import org.bson.Document;

public class EvaluationRecord {
	final private int targetValue = 4;
	private int sid;
	private int leadershipCompetence;
	private int opennessToEmployees;
	private int socialBehaviourToEmployee;
	private int attitudeTowardClients;
	private int communicationSkills;
	private int IntegrityToCompany;
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getLeadershipCompetence() {
		return leadershipCompetence;
	}

	public void setLeadershipCompetence(int leadershipCompetence) {
		this.leadershipCompetence = leadershipCompetence;
	}

	public int getOpennessToEmployees() {
		return opennessToEmployees;
	}

	public void setOpennessToEmployees(int opennessToEmployees) {
		this.opennessToEmployees = opennessToEmployees;
	}

	public int getSocialBehaviourToEmployee() {
		return socialBehaviourToEmployee;
	}

	public void setSocialBehaviourToEmployee(int socialBehaviourToEmployee) {
		this.socialBehaviourToEmployee = socialBehaviourToEmployee;
	}

	public int getAttitudeTowardClients() {
		return attitudeTowardClients;
	}

	public void setAttitudeTowardClients(int attitudeTowardClients) {
		this.attitudeTowardClients = attitudeTowardClients;
	}

	public int getCommunicationSkills() {
		return communicationSkills;
	}

	public void setCommunicationSkills(int communicationSkills) {
		this.communicationSkills = communicationSkills;
	}

	@Override
	public String toString() {
		return "EvaluationRecord [targetValue=" + targetValue + ", sid=" + sid + ", year=" + year + "]";
	}

	public int getIntegrityToCompany() {
		return IntegrityToCompany;
	}

	public void setIntegrityToCompany(int integrityToCompany) {
		IntegrityToCompany = integrityToCompany;
	}

	public int getTargetValue() {
		return targetValue;
	}

	public EvaluationRecord(int year, int leadershipCompetence, int opennessToEmployees, int socialBehaviourToEmployee,
			int attitudeTowardClients, int communicationSkills, int IntegrityToCompany) {
		super();
		this.leadershipCompetence = leadershipCompetence;
		this.opennessToEmployees = opennessToEmployees;
		this.socialBehaviourToEmployee = socialBehaviourToEmployee;
		this.attitudeTowardClients = attitudeTowardClients;
		this.communicationSkills = communicationSkills;
		this.IntegrityToCompany = IntegrityToCompany;
		this.year = year;
	}

	public EvaluationRecord() {

	}

	public Document toDocument() {

		org.bson.Document document = new Document();
		document.append("targetValue", this.targetValue);
		document.append("_id", this.sid);
		document.append("leadershipCompetence", this.leadershipCompetence);
		document.append("opennessToEmployees", this.opennessToEmployees);
		document.append("socialBehaviourToEmployee", this.socialBehaviourToEmployee);
		document.append("attitudeTowardClients", this.attitudeTowardClients);
		document.append("communicationSkills", this.communicationSkills);
		document.append("IntegrityToCompany", this.IntegrityToCompany);
		document.append("year", this.year);

		return document;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvaluationRecord other = (EvaluationRecord) obj;
		if (sid != other.sid)
			return false;
		if (year != other.year)
			return false;
		return true;
	}



}
