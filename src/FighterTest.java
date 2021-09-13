public class FighterTest {
    public static void main (String[] args) {
        // we instantiate a fighter object
        Fighter arata = new Fighter(); // this is a specific fighter we are making; Fighter() is a constructor
        arata.name = "Arata"; // dot notation to access the properties
        arata.hitPoints = 17; // dot notation to access the properties
        arata.maxDamage = 14;
        arata.printStats();
        arata.battleRoar();

        Fighter sozalix = new Fighter();
        sozalix.name = "Sozalix";
        sozalix.battleRoar();
        sozalix.printStats();
        System.out.println("Sozalix attacks and rolls a " + sozalix.attackRoll());
    }
}
