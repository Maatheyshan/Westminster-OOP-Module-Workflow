package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

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
}