public class FactoryCreator {
	public AbstractFactory getFactory(String name) {
		AbstractFactory af = null;
		if ("snack".equalsIgnoreCase(name)) {
			af = new SnackFactory();
		} else if ("softdrink".equalsIgnoreCase(name)) {
			af = new SoftDrinkFactory();
		}
		return af;
	}
}
