package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
//        this.side = side;
    }

    @Override
    public double getPerimeter() {
//        return this.side * 4;
        return length * 4;
    }

    @Override
    public double getArea() {
//        return this.side * this.side;
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
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


