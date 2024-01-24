
public class Robot {
	
	public String name = null;
	
	Robot(String name){
		this.name = name;
	}
	
	//演習7
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
