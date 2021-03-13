package dhbw.fowler2.theatre;

/**
 * Die Klasse ComedyPlay ist eine konkrete Implementierung eines
 * Stückes. Die Klasse stellt dabei eine Komödie dar.
 */
public class ComedyPlay extends Play {
    
    public ComedyPlay(String name) {
        super(name);
    }

    @Override
    int calculateAmount(int audience) {
        return audience > 20 ? 40000 + 500 * (audience - 20) + 300 * audience: 30000 + 300 * audience;
    }

    @Override
    int calculateCredits(int audience) {
        return baseCredits(audience)+ (int) Math.floor(audience / 5);
    }
    
}
