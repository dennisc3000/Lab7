package billing;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    protected double getBaseAmount() {            // currently private
        return units * rate * 0.5;
    }

    protected double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE * 0.2;
    }
}
