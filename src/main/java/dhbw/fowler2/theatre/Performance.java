package dhbw.fowler2.theatre;

/**
 * Die Perfomance-Klasse repräsentiert eine konkrete Aufführung
 * eines Stückes.
 */
public class Performance {

    public Play play;
    public int audience;
    
    /**
     * Der Konstruktur erstellt eine neue Aufführung mit dem übergebenen
     * Stück und der Anzahl an Zuschauern.
     * @param play Das gespielte Stück.
     * @param audience Die Anzahl an Zuschauern.
     */
    public Performance(Play play, int audience) {
        this.play = play;
        this.audience = audience;
    }
}
