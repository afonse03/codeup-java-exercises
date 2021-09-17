package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    // protected properties
   protected double length;
   protected double width;

   // constructor that takes in two numbers and sets those properties
   public Quadrilateral(double length, double width) {
       this.length = length;
       this.width = width;
   }

    public Quadrilateral() {

    }

    // methods for getting the length and width
    public double getLength() {
       return length;
    }

    public double getWidth() {
       return width;
    }

    // abstract methods for setting the length and width
    public abstract void setLength();
    public abstract void setWidth();
}


