package sui;

import junit.framework.TestCase;
import sui.PersonManager;
import sui.Person;

public class PersonManagerTest extends TestCase{
	PersonManager mgr;

	public void setUp(){
		mgr = new PersonManager();
	}
	public void testSave(){
		
		Person per = new Person("testperson",22,"china");
		mgr.save(per);
		int count = mgr.getNumberOfPersons();
		assertEquals(1,count);
	}	

	public void testGetPersonByName(){

		Person per = new Person("testperson",22,"china");
		mgr.save(per);
		per = mgr.getPersonByName("testperson");
		assertNotNull(per);
		per = mgr.getPersonByName("sui");
		assertNull(per);

	}


}