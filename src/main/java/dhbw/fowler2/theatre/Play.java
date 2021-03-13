package dhbw.fowler2.theatre;
/**
 * Die abstrakte Klasse Play repräsentiert ein Stück.
 * Die einzelnen Typen von Stücken werden durch Unterklassen
 * realisiert und dargestellt.
 */
public abstract class Play {

    public String name;

    /**
     * Der Konstruktor erstellt ein neues Stück mit dem übergebenen Namen.
     * @param name Der Name des Stückes
     */
    public Play(String name) {
        this.name = name;
    }
    
    /**
     * Die Methode calculateAmount berechnet die Kosten für ein
     * Stück anhand der Zuschauer.
     * @param audience Die Anzahl der Zuschauer
     * @return Preis des Stückes.
     */
    abstract int calculateAmount(int audience);
    
    /**
     * Die Methode calculateCredits berechnet die Anzahl an Credits,
     * die der Kunde für dieses Stück erhält. Diese ist abhänigig von
     * der Anzahl der Zuschauer.
     * @param audience Die Anzahl der Zuschauer
     * @return Anzahl der erhaltenen Credits
     */
    abstract int calculateCredits(int audience);
    
    /**
     * Die Methode baseCredits berechnet die Anzahl an Punkten,
     * die bei jedem Stück gewährt werden.
     * @param audience Die Anzahl an Zuschauern
     * @return Die Anzahl der erhaltenen Credits
     */
    int baseCredits(int audience) {
        return Math.max(audience - 30, 0);
    }
}
