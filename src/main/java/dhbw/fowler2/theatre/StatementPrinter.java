package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class StatementPrinter {

    public String print(Invoice invoice) {
        var printedString = header(invoice.customer);
        
        for (var perf : invoice.performances) {
            // print line for this order
            printedString += forEachPerformance(perf);
        }
        printedString += footer(invoice);
        return printedString;
    }
    
    abstract String header(Customer customer);
    abstract String forEachPerformance(Performance performance);
    abstract String footer(Invoice invoice);
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
}
