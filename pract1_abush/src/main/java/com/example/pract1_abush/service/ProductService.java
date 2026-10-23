package com.example.pract1_abush.service;
import com.example.pract1_abush.model.Product;
import com.example.pract1_abush.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }

        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("Название товара обязательно");
        }

        return productRepository.save(product);
    }

}
