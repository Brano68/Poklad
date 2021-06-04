package abstractfactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String tipe) {
        switch (tipe){
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }

}
