public class KonkreterBeobachter implements Beobachter{

    private KonkretesSubjekt subjekt;

    public KonkreterBeobachter(KonkretesSubjekt subjekt) {
        this.subjekt = subjekt;

        subjekt.registerBeobachter(this);
    }


    @Override
    public void update() {
        System.out.println("Update");
    }
}
