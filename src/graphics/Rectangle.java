package graphics;

public class Rectangle {
    private int x;
    private int y;
    public int height;
    public int width;
    public static int count=0;

    public Rectangle(){}

    public Rectangle(int x, int y){

        this.y = y ;
        this.x = x ;

    }

   public Rectangle(int x,int y,int height,int width){
        this.height = height = Math.abs(height);
        this.x = x = Math.abs(x) ;
        this.y = y = Math.abs(y);
        this.width = width = Math.abs(width) ;
        count++;
    }
    public Rectangle (Rectangle rec3){
        this.height = rec3.height;
        this.width = rec3.width;
        this.y = rec3.getY();
        this.x = rec3.getX();
        setY(y);
    }
    public void setX(int x){
        this.x = x;

    }
    public void setY(int y){
        this.y = y;

    }
    public int getX(){

        return x;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setGrower(int d){
        this.x += d;
        this.y += d;


    }
    public int getGrow(){
        if(getGrow() < 0){
            Math.abs(getGrow());
        }
        return getGrow();
    }
    public double getArea(){
        
        return height*width;
    }
    public int getPerimeter(){
        
        return (x+y)*2;
    }
    public int getWidth(){
        
        return width;
    }
    public int getHeight(){
        
        return height;
    }
    public int getY(){
        
        return y;
    }
    public static int getCount(){
        return count;
    }
    public void setHeight(int h){
        this.height = h;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
