package org.intarch.assignment2;

import static com.mongodb.client.model.Filters.eq;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;



public class ManagePersonalService implements ManagePersonal{
	
    private MongoClient client = new MongoClient("localhost", 27017);
    private MongoDatabase supermongo = client.getDatabase("highperformance");
    public MongoCollection<Document> salesmen = supermongo.getCollection("salesmen");
    public MongoCollection<Document> evaluation = supermongo.getCollection("evaluation");

	@Override
	public void createSalesMan(SalesMan record) {
			record.toDocument();
	        // saving the salesman object
	        salesmen.insertOne(record.toDocument());
	}

	@Override
	public void addPerformanceReord(EvaluationRecord record, int sid) {
		record.setSid(sid);
		record.toDocument();
        // saving the EvaluationRecord object
		evaluation.insertOne(record.toDocument());
	}

	@Override
	public SalesMan readSalesMan(int sid) {
		
		Document newDocument = this.salesmen.find(eq("_id",sid)).first();
		SalesMan s = new SalesMan();
		s.setFirstname(newDocument.getString("firstname"));
		s.setLastname(newDocument.getString("lastname"));
		s.setId((Integer) newDocument.get("_id"));
		return s;
	}

	@Override
	public List<SalesMan> querySalesMan(String attribute, String key) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public EvaluationRecord readEvaluationRecords(int sid) {
		
		EvaluationRecord er = new EvaluationRecord();
		System.out.println("printing er : "+er);
		Document newDocument = this.evaluation.find(eq("_id",sid)).first();
		System.out.println("document forund " + newDocument);
		er.setSocialBehaviourToEmployee((Integer)newDocument.get("socialBehaviourToEmployee"));
		er.setAttitudeTowardClients((Integer)newDocument.get("attitudeTowardClients"));
		er.setCommunicationSkills((Integer)newDocument.get("communicationSkills"));
		er.setLeadershipCompetence((Integer)newDocument.get("leadershipCompetence"));
		er.setOpennessToEmployees((Integer)newDocument.get("opennessToEmployees"));
		er.setIntegrityToCompany((Integer)newDocument.get("IntegrityToCompany"));
		er.setSid((Integer)newDocument.get("_id"));
		er.setYear((Integer)newDocument.get("year"));
		System.out.println("printing er : "+er);
		
		return er;
	}

}
