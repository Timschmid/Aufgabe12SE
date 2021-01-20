public class main {
    public static void main(String[] args) {
        KonkretesSubjekt subjekt = new KonkretesSubjekt();
        KonkretesSubjekt klo = new KonkretesSubjekt();
        KonkreterBeobachter beobachter = new KonkreterBeobachter(subjekt);
        KonkreterBeobachter beobachter1 = new KonkreterBeobachter(subjekt);
        KonkreterBeobachter beobachter2 = new KonkreterBeobachter(subjekt);

        subjekt.setDerEineStatus(true);
        subjekt.setDerEineStatus(true);
        klo.registerBeobachter(beobachter2);
        klo.registerBeobachter(beobachter);

        subjekt.deleteBeobachter(beobachter1);
        subjekt.setDerEineStatus(false);

        klo.setDerEineStatus(true);

    }
}
