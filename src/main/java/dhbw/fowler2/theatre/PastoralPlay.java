package dhbw.fowler2.theatre;

/**
 *Die Klasse PastoralPlay repräsentiert ein Stück vom Typ "pastoral".
 */
public class PastoralPlay extends Play {

    public PastoralPlay(String name) {
        super(name);
    }

    @Override
    int calculateAmount(int audience) {
       return audience > 20 ? 40000 + 500 * (audience - 20) + 300 * audience: 30000 + 300 * audience;
    }

    @Override
    int calculateCredits(int audience) {
       return baseCredits(audience)+ (int) Math.floor(audience / 2);
    }
    
}
