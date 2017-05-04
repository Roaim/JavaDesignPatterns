public class SnackFactory extends AbstractFactory {

	@Override
	public Snack getSnack(String name) {
		Snack snack = null;
		if ("pizza".equalsIgnoreCase(name)) {
			snack = new Pizza();
		} else if ("burger".equalsIgnoreCase(name)) {
			snack = new Burger();
		}
		return snack;
	}

	@Override
	public SoftDrink getSoftDrink(String name) {
		return null;
	}

}
