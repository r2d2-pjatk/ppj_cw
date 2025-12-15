package zadanie11;

public class Kosc {
    
    public int roll() {
        //if (this.getClass().equals(Kosc.class))
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        String diceTypeStr = this.getClass().getName();
        diceTypeStr = diceTypeStr.substring(diceTypeStr.indexOf(".") + 1);
        return diceTypeStr;
    }
    
}


class K4 extends Kosc {
    
    @Override
    public int roll() {
        return (int) (Math.random() * 4 + 1);
    }
    
}


class K6 extends Kosc {
    
    @Override
    public int roll() {
        return (int) (Math.random() * 6 + 1);
    }

}


class K8 extends Kosc {
    
    @Override
    public int roll() {
        return (int) (Math.random() * 8 + 1);
    }
    
}


class K12 extends Kosc {
    
    @Override
    public int roll() {
        return (int) (Math.random() * 12 + 1);
    }

}


class K20 extends Kosc {
    
    @Override
    public int roll() {
        return (int) (Math.random() * 20 + 1);
    }

}
