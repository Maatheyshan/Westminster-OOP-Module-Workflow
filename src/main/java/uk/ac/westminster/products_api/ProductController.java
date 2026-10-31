package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    /*
     * Tutorial 02 Endpoint (Commented Out)[cite: 1]:
     *
     * @GetMapping("/{id}")
     * public Product getById(@PathVariable Long id) {
     *     return new Product(id, "Laptop", 999.99);
     * }
     */

    // Tutorial 03 - Activity 2[cite: 2]:
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Tutorial 03 - Activity 3[cite: 2]:
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    // Tutorial 03 - Activity 3[cite: 2]:
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // Tutorial 03 - Activity 4[cite: 2]:
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    // Tutorial 03 - Activity 5[cite: 2]:
    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }

    // ── in ProductController.java ────────────────────
    @GetMapping("/products/summaries")
    public List<String> getSummaries() {
        return productService.getAllSummaries();
    }
}