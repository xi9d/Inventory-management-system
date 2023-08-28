package com.paul.IMS.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(UUID id);
    Product saveProduct(Product product);
    void deleteProduct(UUID id);
}
