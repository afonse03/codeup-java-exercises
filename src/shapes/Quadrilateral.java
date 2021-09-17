//quadrilateral is the parent class

package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    // protected properties
   protected double length;
   protected double width;

   // constructor that takes in two numbers and sets those properties
   public Quadrilateral(double length, double width) {
       this.length = length;
       this.width = width;
   }

//    public Quadrilateral() {
//
//    }

    // method for getting the length
    public double getLength() {
       return length;
    }

    // abstract method for setting the length
    public abstract void setLength(double length);

    // method for getting the width
    public double getWidth() {
       return width;
    }

    // abstract method for setting the width
    public abstract void setWidth(double width);


}


