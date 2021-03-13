package dhbw.fowler2.theatre;

import java.util.List;
/**
 * Die Klasse Invoice repräsentiert eine Rechnung.
 * Eine Rechnung bezieht sich auf einen Kunden und besteht
 * aus mehreren Aufführungen.
 */
public class Invoice {

    public Customer customer;
    public List<Performance> performances;
    private int totalAmount;
    private int totalCredits;

    /**
     * Der Konstruktor erstellt eine neue Rechnung mit dem übergebenen
     * Kunden und der Liste an Aufführungen.
     * @param customer Der Kunde, für den die Rechnung erstellt wird.
     * @param performances Die Liste an Aufführungen.
     */
    public Invoice(Customer customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }
    
    /**
     * Die Methode calculateAmount berechnet die Summe der Kosten aller
     * Aufführungen.
     * @return Gesamte Kosten für diese Rechnung.
     */
    public int calculateAmount() {
        totalAmount = 0;
        performances.forEach(performance -> {totalAmount += performance.play.calculateAmount(performance.audience);});
        return totalAmount / 100;
    }
    
    /**
     * Die Methode calculateCredits berechnet die Summe an Rabatt-Credits
     * für die gesamte Rechnung (also für alle Aufführungen).
     * @return Die gesamten Credits für diese Rechnung
     */
    public int calculateCredits() {
        totalCredits = 0;
        performances.forEach(performance -> {totalCredits += performance.play.calculateCredits(performance.audience);});
        return totalCredits;
    }
}
