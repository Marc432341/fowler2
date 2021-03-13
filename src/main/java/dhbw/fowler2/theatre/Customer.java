package dhbw.fowler2.theatre;

/**
 * Die Klasse Customer repräsentiert einen Kunden.
 */
public class Customer {
    private String name;
    /**
     * Der Konstruktor erstellt einen neuen Kunden mit dem übergebenen
     * Name.
     * @param name Der Name des Kunden.
     */
    public Customer(String name) {
        this.name = name;
    }
    /**
     * Die Methode getName gibt den Namen des Kundens zurück.
     * @return Name des Kunden
     */
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
