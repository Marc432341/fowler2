package dhbw.fowler2.theatre;

/**
 * Die Klasse TextStatementPrinter erzeugt die Ausgabe
 * für eine Rechnung in Text-Form.
 */
public class TextStatementPrinter extends StatementPrinter{

    @Override
    String header(Customer customer) {
        return String.format("Statement for %s\n", customer);
    }

    @Override
    String footer(Invoice invoice){
       return String.format("Amount owed is %s\n", format.format(invoice.calculateAmount()))
         + String.format("You earned %s credits\n", invoice.calculateCredits());
    }

    @Override
    String forEachPerformance(Performance performance) {
        return String.format("  %s: %s (%s seats)\n", performance.play.name, format.format( performance.play.calculateAmount(performance.audience) / 100), performance.audience);
    }
    
}
