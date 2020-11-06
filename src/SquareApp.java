public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();
        //sq.setSide(4);
        sq.setPosition(3,2);
        sq.setHeight(5);
        sq.setWidth(5);



        System.out.println(sq.getSide());

        System.out.println(sq.getHeight());
        System.out.println(sq.getWidth());

    }
}
