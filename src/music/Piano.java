package music;
//import shapes; // this is how you refer to other packages by using the keyword import
public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable { // class
    // instance field
    private String numberOfKeys;

    // updated constructor
    public Piano(String instrumentClassification, String numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    // getter
    public String getNumberOfKeys() {
        return numberOfKeys;
    }

    // setter
    public void setNumberOfKeys(String numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    // methods
    @Override
    public void startMusic() {
        System.out.println("Let's play!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Let's stop!");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Let's tune!");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Let's detune!");
    }

    @Override
    public void volumeUp() {
        System.out.println("Raise the volume!");
    }

    @Override
    public void volumeDown() {
        System.out.println("Bring the volume down!");
    }
}
