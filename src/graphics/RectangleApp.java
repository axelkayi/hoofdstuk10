package graphics;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("this progam uses a rectangle");
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle();
        Rectangle rec3 = new Rectangle(2,3);
        rec1.width = 5;
        rec1.getX();
        rec1.getY();
        rec1.height = 10;
        rec.width = 10;
        rec.height = 5;
        rec.getX();
        rec.getY();
        rec.setX(3);
        rec.setY(2);
        rec.getCount();



        System.out.println(rec.width);
        System.out.println(rec.height);
        System.out.println(rec.getX());
        System.out.println(rec.getY());
        System.out.println(rec1.height);
        System.out.println(rec1.width);
        System.out.println(rec1.getX());
        System.out.println(rec1.getY());
        System.out.println(rec.getArea());
        System.out.println(rec1.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec1.getPerimeter());
        System.out.println(rec.getX());
        System.out.println(rec1.getX());
        System.out.println(rec.getY());
        System.out.println(rec1.getY());
        System.out.println(rec.getGrow());
        System.out.println(rec1.getGrow());
        System.out.println(rec3.getY());
        System.out.println(rec3.getX());
        System.out.println(rec.getCount());
    }
}
