/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.fowler2.theatre;

/**
 * Die Klasse TragedyPlay ist eine konkrete Implementierung eines
 * Stückes. Die Klasse stellt dabei eine Tragödie dar.
 */
public class TragedyPlay extends Play {
    
    public TragedyPlay(String name) {
        super(name);
    }

    @Override
    int calculateAmount(int audience) {
        return audience > 30 ? 40000 + 1000 * (audience - 30) : 40000;
    }

    @Override
    int calculateCredits(int audience) {
        return baseCredits(audience);
    }
    
   
}
