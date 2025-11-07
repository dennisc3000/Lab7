package billing;

public class Demo {
    public static void main(String[] args) {
        Site r = new ResidentialSite(100, 1.00); // base=50, tax=1.2 → total=51.2
        Site l = new LifelineSite(100, 1.00);    // base=100, tax=12 → total=112.0

        System.out.printf("Residential: %.2f%n", r.getBillableAmount());
        System.out.printf("Lifeline:    %.2f%n", l.getBillableAmount());
    }
}