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
    private MongoCollection<Document> salesmen = supermongo.getCollection("salesmen");
    private MongoCollection<Document> evaluation = supermongo.getCollection("evaluation");

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
        salesmen.insertOne(record.toDocument());
	}

	@Override
	public SalesMan readSalesMan(int sid) {
		// TODO Auto-generated method stub
		Document newDocument = this.salesmen.find().first();
		SalesMan s = new SalesMan(null, null, sid);
		s.setFirstname(newDocument.getString("firstname"));
		s.setLastname(newDocument.getString("lastname"));
		s.setId((Integer) newDocument.get("id"));
		return s;
	}

	@Override
	public List<SalesMan> querySalesMan(String attribute, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EvaluationRecord readEvaluationRecords(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
