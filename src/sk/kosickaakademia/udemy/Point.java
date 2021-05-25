package sk.kosickaakademia.udemy;

public class Point {

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point point = new Point();
        System.out.println(point.distance());

        System.out.println("---");
        System.out.println(point.distance(1,-1));
    }

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        double dis = x*x + y*y;
        return Math.sqrt(dis);
    }

    public double distance(int x, int y){
        double result = ((x-(this.x))*(x-(this.x)))+((y-(this.y))*(y-(this.y)));
        return Math.sqrt(result);
    }

    public double distance(Point point){
        double result = ((point.getX()-(this.x))*(point.getX()-(this.x)))+((point.getY()-(this.y))*(point.getY()-(this.y)));
        return Math.sqrt(result);
    }
}
