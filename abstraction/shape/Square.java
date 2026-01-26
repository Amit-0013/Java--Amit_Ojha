package abstraction.shape;

public class Square extends Shape{
    private final int side;
    public Square(int side){
        this.side = side;
    }
    double calculateArea(){
        return side * side;
    }


}
