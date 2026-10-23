package com.example.pract1_abush.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pract1_abush.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
