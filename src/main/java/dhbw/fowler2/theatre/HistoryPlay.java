/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.fowler2.theatre;

/**
 * Die Klasse HistoryPlay repräsentiert ein Stück vom Typ "Geschichte".
 */
public class HistoryPlay extends Play {

    public HistoryPlay(String name) {
        super(name);
    }

    @Override
    int calculateAmount(int audience) {
        return audience > 10 ? 20000 + 200 * (audience - 10) : 20000;
    }

    @Override
    int calculateCredits(int audience) {
        return baseCredits(audience);
    }
    
}
