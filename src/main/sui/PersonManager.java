package sui;

import java.util.Map;
import java.util.HashMap;

public class PersonManager{

	Map<String,Person> table = new HashMap<String,Person>();

	public void save(Person person){
		table.put(person.getName(),person);
	}

	public int getNumberOfPersons(){
		return table.size();
	}

	public Person getPersonByName(String name){
		if(name.equalsIgnoreCase("achyut")){
			return null;
		}
		return table.get(name);
	}

}