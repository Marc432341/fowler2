/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.fowler2.theatre;

/**
 * Die Klasse HtmlStatement erzeugt die HTML-Ausgabe für einen Kunden.
 */
public class HTMLStatementPrinter extends StatementPrinter{

    @Override
    String header(Customer customer) {
        return "<H1>Statement for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    String forEachPerformance(Performance performance) {
        return "  " + performance.play.name + ": " + 
        format.format( performance.play.calculateAmount(performance.audience) / 100) + 
        "(" + String.valueOf(performance.audience) + " seats)<BR>\n";
    }

    @Override
    String footer(Invoice invoice) {
       return "<P>Amount owed is <EM>" +
            format.format(invoice.calculateAmount() + "</EM><P>\n" 
            + "You earned <EM>" +
            invoice.calculateCredits()) +
            "</EM> credits.<P>";
    }
    
}
