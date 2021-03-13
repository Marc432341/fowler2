package dhbw.fowler2.theatre;

import org.junit.Assert;
import org.junit.Test;

/**
 * Die Klasse PlayTest testet die Klasse Play.
 */
public class PlayTest {
    
    @Test
    public void testComedyPlay() {
        Play comedy = new ComedyPlay("24 Stunden Aufenthalt");
        Assert.assertEquals("Die Preisberechnung in der Klasse ComedyPlay funktioniert nicht",
                            33000,
                            comedy.calculateAmount(10));
    }
    @Test
    public void testHistoryPlay() {
        Play history = new HistoryPlay("King John");
        Assert.assertEquals("Die Preisberechnung in der Klasse HistoryPlay funktioniert nicht",
                            20000,
                            history.calculateAmount(10));
    }
    @Test
    public void testTragedyPlay() {
        Play tragedy = new TragedyPlay("Romeo und Julia");
        Assert.assertEquals("Die Preisberechnung in der Klasse TradegyPlay funktioniert nicht",
                            40000,
                            tragedy.calculateAmount(10));
    }
    @Test
    public void testPastoralPlay() {
        Play pastoral = new PastoralPlay("Das Leben des Brian");
        Assert.assertEquals("Die Preisberechnung in der Klasse PastoralPlay funktioniert nicht",
                            33000,
                            pastoral.calculateAmount(10));
    }
}
