package billing;

public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        // Full base and full tax (different constants vs ResidentialSite)
        double base = units * rate;
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }
}

