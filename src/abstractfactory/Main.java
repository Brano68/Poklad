package abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        Square square = (Square) shapeFactory.getShape("Square");
        square.draw();
    }

}
