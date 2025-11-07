package billing;

public class LifelineSite extends Site {
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return units * rate;
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}