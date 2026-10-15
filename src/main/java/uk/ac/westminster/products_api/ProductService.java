package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Activity 1
    public List<Product> getAllProducts() {
        return products;
    }

    // Activity 1
    public Product addProduct(Product product) {
        product.setId(nextId++);   // use the value, then add one
        products.add(product);
        return product;
    }

    // Activity 3 (Extra)
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // Activity 4 (Extra)
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Activity 5 (Extra)
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}