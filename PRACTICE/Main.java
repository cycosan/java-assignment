package PRACTICE;
abstract class  Shape {
    abstract void RectangleArea(int len,int brd);
    abstract void SquareArea(int len);
    abstract void CircleArea(int rad);
}  

class Area extends Shape {
    void RectangleArea(int len,int brd){
        System.out.println("Area of rectangle: "+len*brd);
    }
    void SquareArea(int len){
        System.out.println("Area of square: "+len*len);

    }
    void  CircleArea(int rad){
        System.out.println("Area of circle: "+(3.14*rad*rad));

    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Area area =new Area();
        area.RectangleArea(5,4);
        area.SquareArea(3);
        area.CircleArea(5);

    }
}
