import java.util.ArrayList;
import java.util.List;

public class KonkretesSubjekt implements Subjekt {

    private boolean derEineStatus = false;

    List<Beobachter> beobachterListe = new ArrayList<>();

    public boolean isDerEineStatus() {
        return derEineStatus;
    }

    public void setDerEineStatus(boolean derEineStatus) {

        if(derEineStatus != this.derEineStatus)
            messageAllBeobachter();

        this.derEineStatus = derEineStatus;

    }

    @Override
    public void registerBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    @Override
    public void deleteBeobachter(Beobachter beobachter) {
        beobachterListe.remove(beobachter);
    }

    @Override
    public void messageAllBeobachter() {
        for (Beobachter beobachter : beobachterListe) {
            beobachter.update();
        }
    }
}
