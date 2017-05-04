
public class Main implements Constants{
	
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape sTriangle = sf.getShape(SHAPE_TRIANGLE);
		sTriangle.onDraw();
		Shape sCircle = sf.getShape(SHAPE_CIRCLE);
		sCircle.onDraw();
		Shape sRectangle = sf.getShape(SHAPE_RECTANGLE);
		sRectangle.onDraw();
		Shape sSquire = sf.getShape(SHAPE_SQUIRE);
		sSquire.onDraw();
	}
}
