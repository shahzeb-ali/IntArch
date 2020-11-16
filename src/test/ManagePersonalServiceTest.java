package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.intarch.assignment2.EvaluationRecord;
import org.intarch.assignment2.ManagePersonalService;
import org.intarch.assignment2.SalesMan;
import org.junit.Ignore;


class ManagePersonalServiceTest {

	ManagePersonalService mps = new ManagePersonalService();
	
	SalesMan s1 =new SalesMan("s1first","s1last",123);
	SalesMan s2 =new SalesMan("s2first","s2last",124);
	
	EvaluationRecord ertest = new EvaluationRecord(2010,3,4,2,3,2,4);
	EvaluationRecord er2test = new EvaluationRecord(2011,3,4,2,3,2,4);
	
	@Test
	void testCreateSalesMan() {

		mps.createSalesMan(s1);
		mps.createSalesMan(s2);
	}

	@Test
	void testAddPerformanceReord() {
		
		mps.addPerformanceReord(ertest, 123);
		System.out.println(ertest);
		
		mps.addPerformanceReord(er2test, 124);
		
	}

	@Test
	void testReadSalesMan() {
	assertEquals(s1.getId(),mps.readSalesMan(123).getId());
	assertEquals(s2.getId(),mps.readSalesMan(124).getId());

	}

	@Ignore
	void testQuerySalesMan() {
		fail("Not yet implemented");
	}

	@Test
	void testReadEvaluationRecords() {
		assertEquals(123,mps.readEvaluationRecords(123).getSid());
	}


}
