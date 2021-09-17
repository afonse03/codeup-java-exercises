package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Quadrilateral {
    // constructor
    public Rectangle(double length, double width) {
        super(length, width); // super is a constructor
    }

    @Override
    public double getPerimeter() { // you have to update the formulas or else you'll return zero
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
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

//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle (int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//
//    }
//
//    public int getArea() { return length * width; }
//
//    public int getPerimeter() { return 2 * length + 2 * width; }
//}
