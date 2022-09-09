public class Ingrediens {

    //Attributes
    private String type;
    private double amount;
    private String unit;
    private double weightPrUnit;
    private double energy;
    private final int DEFAULT_NUMBER_OF_PERSONS = 4;

    //Constructor
    public Ingrediens(String type, double amount, String unit, double weightPrUnit, double energy) {
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.weightPrUnit = weightPrUnit;
        this.energy = energy;
    }

    //Methods

    //GET
    public String getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    public String getUnit() {
        return unit;
    }
    public double getWeightPrUnit() {
        return weightPrUnit;
    }
    public double getEnergy() {
        return energy;
    }
    public final int getDEFAULT_NUMBER_OF_PERSONS() {
        return DEFAULT_NUMBER_OF_PERSONS;
    }

    //SET
    public void setType(String newType) {
        this.type = newType;
    }
    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }
    public void setUnit(String newUnit) {
        this.unit = newUnit;
    }
    public void setWeightPrUnit(double newWeightPrUnit) {
        this.weightPrUnit = newWeightPrUnit;
    }
    public void setEnergy(double newEnergy) {
        this.energy = newEnergy;
    }

    //To String
    public String toString(){
        return this.type + " " + this.amount + " " + this.unit + " (" + this.energy + " kJ) ";
    }
}
