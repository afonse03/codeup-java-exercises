package shapes;

public class Square extends Quadrilateral{
    public Square(double length, double width) {
        super(length, width);
    }

    public Square() {
        super();
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }
}

//public class Square extends Rectangle {
//    public Square(int length, int width) {
//        super(length, width);
//    }
//
//    public Square() {
//        super();
//    }
//
//    public Square(int side) {
//        length = side;
//        width = side;
//    }
//}


