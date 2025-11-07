package billing;

public abstract class Site {
    protected final double units;   // kWh or similar
    protected final double rate;    // price per unit
    public static final double TAX_RATE = 0.12;  // arbitrary for demo

    protected Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public final double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount();



    public double getUnits() { return units; }
    public double getRate() { return rate; }
}
