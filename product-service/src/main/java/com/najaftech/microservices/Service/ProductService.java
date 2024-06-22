package com.najaftech.microservices.Service;

import com.najaftech.microservices.Model.ProductDTO;

public interface ProductService {
    
    public long addNewProduct(ProductDTO product);
}
