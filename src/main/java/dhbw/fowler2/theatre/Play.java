package dhbw.fowler2.theatre;

public abstract class Play {

    public String name;

    public Play(String name) {
        this.name = name;
    }
    
    abstract int calculateAmount(int audience);
    abstract int calculateCredits(int audience);
    
    int baseCredits(int audience) {
        return Math.max(audience - 30, 0);
    }
}
