
public class Main {
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance("Single instance created");
		obj1.printMessage();
		Singleton obj2 = Singleton.getInstance("Same instance with different msg");
		obj2.printMessage();
		System.out.println("Is obj1 == obj2 : " + (obj1==obj2));
	}
}
