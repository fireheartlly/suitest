package sui;

public class Person{

	private String name;
	private int age;
	private String address;


	public Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}


}