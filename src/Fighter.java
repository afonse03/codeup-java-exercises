public class Fighter {
    // instance variables
    public String name;
    public int hitPoints;
    public int maxDamage;

    // methods
    public void printStats() { //return type declaration
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar() {
        System.out.println("I am " + name + ", prepare to be defeated!");
    }

    // you call a static method with a class name (e.g., D20.roll20())
    // but you call non-static method using a reference variable name (object name) (e.g., arata.attackRoll())
    public int attackRoll() {
        return D20.roll20();
    }

    public Fighter() {
        System.out.println("A new fighter has emerged!");
    }
//    public Fighter(String name, int hitPoints, int maxDamage) {
//
//        this.name = name;
//        this.hitPoints = hitPoints;
//        this.maxDamage = maxDamage;
//        this.printStats();
//    }


}

// instantitation:
