package billing;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getBaseAmount() {            // currently private
        return units * rate * 0.5;
    }

    private double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE * 0.2;
    }
}
