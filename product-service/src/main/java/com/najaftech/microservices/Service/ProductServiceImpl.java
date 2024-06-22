package com.najaftech.microservices.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najaftech.microservices.Entity.Product;
import com.najaftech.microservices.Model.ProductDTO;
import com.najaftech.microservices.Repository.ProductRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public long addNewProduct(ProductDTO product) {
        Product newProduct = Product.builder()
            .productDescription(product.getProductDescription())
            .productName(product.getProductName())
            .productPrice(product.getProductPrice())
            .build();
            productRepository.save(newProduct);
        return newProduct.getProductId();
    }
}
