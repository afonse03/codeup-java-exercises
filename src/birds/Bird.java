package birds;

public class Bird {

    //what kind of bird is it?
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Tweet tweet");
    }

    public void move() {
        System.out.println("Flap flap");
    }

    //constructor with an argument
    public Bird(String name) {

    }

    // OOP style means you don't put a main in here
}
