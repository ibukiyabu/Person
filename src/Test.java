
public class Test {

	public static void main(String[]args) {
		
		
		Person taro = new Person("山田太郎",20,"000-0000-0000", "Osaka");
		Person jiro = new Person("木村次郎",18, "111-1111-1111", "Tokyo");
		Person ibuki = new Person("薮 慰夫貴", 29, "222-2222-2222", "Fukuoka");
		
		//Robot
		Robot aibo = new Robot("aibo");
		Robot asimo = new Robot("asimo");
		Robot pepper = new Robot("pepper");
		
		
		taro.printData();
		jiro.printData();
		ibuki.printData();
		
		//演習6
		taro.talk();
		taro.walk();
		taro.run();
		
		//演習8
		aibo.talk();
		asimo.walk();
		pepper.run();
	}
	
}
