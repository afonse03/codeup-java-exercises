package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        // declared variable of the type Measurable named myShape
//        Measurable myShape;
//        myShape = new Square(10);
//        myShape = new Rectangle(12, 25);
//        System.out.println(myShape.getPerimeter());
//        System.out.println(myShape.getArea());

        Measurable rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea() + " is the area of a rectangle.");
        System.out.println(rectangle.getPerimeter() + " is the perimeter of a rectangle.");

        Measurable square = new Square(10);
        System.out.println(square.getArea() + " is the area of a square.");
        System.out.println(square.getPerimeter() + " is the perimeter of a square.");
    }
}

//public class ShapesTest {
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//    }
//}
