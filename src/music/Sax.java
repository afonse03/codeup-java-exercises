package music;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String saxType;

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
        System.out.println("Volume up!");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down!");
    }
}
