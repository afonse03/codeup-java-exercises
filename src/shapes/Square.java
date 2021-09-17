package shapes;

public class Square extends Rectangle {
    public Square(int length, int width) {
        super(length, width);
    }

    public Square() {
        super();
    }

    public Square(int side) {
        length = side;
        width = side;
    }
}


