
public class Person {
	
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;

	
	Person(String name, int age, String phoneNumber, String address){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public void printData() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.phoneNumber);
		System.out.println(this.address);
	}
	
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	
	public void run() {
		System.out.println(this.name + "が走る");
	}
	
	
}
