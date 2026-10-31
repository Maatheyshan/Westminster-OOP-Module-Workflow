package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double discountedPrice;
    private double weightKg;
    private String dimensions;
    private double capped;

    // TODO (a): empty no-arg constructor for Jackson

    public PhysicalProduct() {}
    // TODO (b): full constructor.
    //           First line must be super(id, name, price);
    //           then assign this.weightKg and this.dimensions

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    // TODO (c): getWeightKg() and getDimensions()
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg;
    }

    @Override
    public void applyDiscount(double rate) {
        capped = Math.min(rate,0.20);
        discountedPrice = getPrice()*(1-capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}