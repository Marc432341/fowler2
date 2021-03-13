package dhbw.fowler2.theatre;

import org.junit.Assert;
import org.junit.Test;

/**
 * Die Klasse CustomerTest testet die Klasse Customer.
 */
public class CustomerTest {
    /**
     * Die Methode testCustomer testet die Erzeugung eines Kunden.
     */
    @Test
    public void testCustomer() {
        Customer customer = new Customer("Herbert Müller");
        Assert.assertEquals("Die Erzeugung des Kundens funktioniert nicht", 
                "Herbert Müller", 
                customer.getName());
    }
}
