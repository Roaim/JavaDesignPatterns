import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		print("To exit enter anything except what u r asked");
		print("You want snack or softdrink?");
		while(s.hasNext()) {
			FactoryCreator fc = new FactoryCreator();
			String choice = s.next();
			AbstractFactory factory = fc.getFactory(choice);
			if("snack".equalsIgnoreCase(choice)) {
				print("You have choosen Snack. \nDo you want Pizza or Burger?");
				choice = s.next();
				Snack snack = factory.getSnack(choice);
				if("pizza".equalsIgnoreCase(choice)||"burger".equalsIgnoreCase(choice)) {
					snack.onEat();
				} else {
					break;
				}
			} else if("Softdrink".equalsIgnoreCase(choice)) {
				print("You have choosen Softdrink. \nDo you want Sprite or 7up?");
				choice = s.next();
				SoftDrink softDrink = factory.getSoftDrink(choice);
				if("sprite".equalsIgnoreCase(choice) || "7up".equalsIgnoreCase(choice)) {
					softDrink.onDrink();
				} else {
					break;
				}
			} else {
				break;
			}
			print("You want snack or softdrink?");
		}
		s.close();
		print("You choose wrong keyword. System will exit in...");
		new Thread(new Runnable(){

			private int i = 3;
				@Override
				public void run() {
					// TODO: Implement this method
					while(i>0) {
						print(i+" sec");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						i--;
					}
					System.exit(0);
				}
			}).start();
	}

	private static void print(String p0) {
		System.out.println(p0);
	}
}
