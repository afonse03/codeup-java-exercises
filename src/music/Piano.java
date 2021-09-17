package music;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String numberOfKeys;

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
