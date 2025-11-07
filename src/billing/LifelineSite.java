package billing;

public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    protected double getBaseAmount() {
        return units * rate;
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}

