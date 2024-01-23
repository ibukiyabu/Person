
public class Person {
	
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;

	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void printData() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

}
