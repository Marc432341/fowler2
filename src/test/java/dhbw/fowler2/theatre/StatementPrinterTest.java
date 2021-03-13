package dhbw.fowler2.theatre;

import dhbw.fowler2.theatre.Play;
import dhbw.fowler2.theatre.Performance;
import dhbw.fowler2.theatre.StatementPrinter;
import dhbw.fowler2.theatre.Invoice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * Die Klasse StatementPrinterTest testet die Klasse
 * TextStatemntPrinter
 * @author nikla
 */
public class StatementPrinterTest {

    @Test
    public void printsStatements() {
        /* Die Erzeugung der Stücke wird durch Polymophismus ersetzt. */
        List<Play> plays = List.of(new TragedyPlay("Hamlet"),
                                    new ComedyPlay("As You Like It"), 
                                    new TragedyPlay("Othello") );
        /*Hier wurde der String Customer durch ein Objekt vom Typ 
        Customer ersetzt*/
        Customer customer = new Customer("BigCo");
        List<Performance> performances = List.of(new Performance(plays.get(0), 55),
                new Performance(plays.get(1), 35),
                new Performance(plays.get(2), 40));
        Invoice invoice = new Invoice(customer, performances);

        StatementPrinter statementPrinter = new TextStatementPrinter();
        var result = statementPrinter.print(invoice);

        Assert.assertEquals("Statement print mismatch", "Statement for BigCo\n" +
                "  Hamlet: $650.00 (55 seats)\n" +
                "  As You Like It: $580.00 (35 seats)\n" +
                "  Othello: $500.00 (40 seats)\n" +
                "Amount owed is $1,730.00\n" +
                "You earned 47 credits\n", result);
    }
}
