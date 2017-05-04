public class SoftDrinkFactory extends AbstractFactory
{

	@Override
	public Snack getSnack(String name) {
		return null;
	}

	@Override
	public SoftDrink getSoftDrink(String name) {
		SoftDrink softDrink = null;
		if ("sprite".equalsIgnoreCase(name)) {
			softDrink = new Sprite();
		} else if ("7up".trim().equalsIgnoreCase(name)) {
			softDrink = new SevenUp();
		}
		return softDrink;
	}
	
}
