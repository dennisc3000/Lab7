package billing;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        // Example differences vs LifelineSite: discounted base and lower taxable portion
        double base = units * rate * 0.5;            // 50% discount tier
        double tax  = base * Site.TAX_RATE * 0.2;    // only 20% of base is taxed
        return base + tax;
    }
}
