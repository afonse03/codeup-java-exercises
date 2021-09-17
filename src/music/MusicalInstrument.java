// abstract classes and interfaces bonus exercise

package music;

// create an abstract class called MusicalInstrument that implements a Playable interface
public abstract class MusicalInstrument implements Playable {

    // private string field
    private String instrumentClassification;

    // constructor
    public MusicalInstrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification; // when you add this, the constructor sets the value of instrumentClassification
    }

    // getter
    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    // setter
    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }
}

