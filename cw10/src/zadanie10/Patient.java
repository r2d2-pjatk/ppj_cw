package zadanie10;

public class Patient {
    
    private final String patientName;
    
    public Patient(String name) {
        this.patientName = name;
    }
    
    public String name() {
        return patientName;
    }
    
    public String illness() {
        if (this.getClass().equals(IllHead.class))
            return "head";
        else if (this.getClass().equals(IllLeg.class))
            return "leg";
        else if (this.getClass().equals(IllDyspepsia.class))
            return "dyspepsia";
        else
            throw new IllegalArgumentException("illness object not found");
    }
    
    public String treatment() {
        if (this.getClass().equals(IllHead.class))
            return "aspirin";
        else if (this.getClass().equals(IllLeg.class))
            return "plaster";
        else if (this.getClass().equals(IllDyspepsia.class))
            return "coal";
        else
            throw new IllegalArgumentException("illness object not found");
    }
    
}


class IllHead extends Patient {
    
    public IllHead(String name) {
        super(name);
    }
    
}


class IllLeg extends Patient {
    
    public IllLeg(String name) {
        super(name);
    }
    
}


class IllDyspepsia extends Patient {
    
    public IllDyspepsia(String name) {
        super(name);
    }
    
}