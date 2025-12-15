package zadanie11;

public class WorekKosci {
    
    private Kosc[] kosci = {
        new K4(),
        new K6(),
        new K8(),
        new K12(),
        new K20(),
    };
    
    public Kosc wylosujKosc() {
        return kosci[(int) (Math.random() * kosci.length)];
    }
    
}
