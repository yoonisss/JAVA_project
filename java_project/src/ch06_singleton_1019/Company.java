package ch06_singleton_1019;

public class Company {

	private static Company instance = new Company();
	String name;
	String address;
	int age;
	
	private Company(){}
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}
}
