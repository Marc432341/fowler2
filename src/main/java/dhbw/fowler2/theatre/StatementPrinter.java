package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Die abstrakte Klasse StatementPrinter erzeugt eine
 * Ausgabe. Die Unterklassen spezifizieren dabei, wie genau 
 * die Ausgabe erfolgen soll. Die Reihenfolge der Aufrufe der von den
 * Unterklassen implementierten Methoden wird in dieser Klasse
 * festgelegt
 */
public abstract class StatementPrinter {

   NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
   /**
    * Die Methode print erzeugt eine Ausgabe für eine Rechnung.
    * @param invoice Rechnung, für die die Ausgabe erstellt werden soll.
    * @return Die Ausgabe
    */
    public final String print(Invoice invoice) {
        var printedString = header(invoice.customer);
        
        for (var perf : invoice.performances) {
            // print line for this order
            printedString += forEachPerformance(perf);
        }
        printedString += footer(invoice);
        return printedString;
    }
    /**
     * Die abstrakte Methode header erzeugt den Header einer Ausgabe
     * mit den Details zu einem Kunden.
     * @param customer Der Kunde, für den der Header erstellt werden soll.
     * @return Header für den Kunden.
     */
    abstract String header(Customer customer);
    
    /**
     * Die abstrakte Methode forEachPerformance erzeugt die Ausgabe für
     * eine Aufführung.
     * @param performance Die Aufführung, für die die Ausgabe erzeugt werden
     * soll.
     * @return Ausgabe für die Aufführung.
     */
    abstract String forEachPerformance(Performance performance);
    
    /**
     * Die abstrakte Methode footer erzeugt die Ausgabe für Details 
     * zur Rechnung.
     * @param invoice Die Rechnung, für die die Ausgabe erstellt werden soll.
     * @return Ausgabe für die Rechnung.
     */
    abstract String footer(Invoice invoice);
   
}
