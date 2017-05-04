public class ShapeFactory implements Constants {
	
	public Shape getShape(String type) {
		Shape shape = null;
		switch(type) {
			case SHAPE_RECTANGLE:
				shape = new Rectangle();
				break;
			case SHAPE_SQUIRE:
				shape = new Squire();
				break;
			case SHAPE_CIRCLE:
				shape = new Circle();
				break;
			case SHAPE_TRIANGLE:
				shape = new Triangle();
				break;
			default: shape = null;
		}
		return shape;
	}
}
