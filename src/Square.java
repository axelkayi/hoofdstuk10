import graphics.Rectangle;

public class Square extends Rectangle {
    private int side;


    public Square(){}

    public Square(int side){
        this.side = side;
    }
    public Square(int side, int x, int y) {
        super(x, y);
        this.side = side;
    }

    public Square(Square side ){
        System.out.println(Square.getCount());

    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        this.side = side;
        if(side > 0){
            Math.abs(side);
        }
        super.setHeight(side);
        super.setWidth(side);

    }

    /*public void setWidth(int w){
        setSide(w);
    }

    public void getHeight(int h){
        setSide(h);
    }*/
}
