package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public Rectangle() {

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
