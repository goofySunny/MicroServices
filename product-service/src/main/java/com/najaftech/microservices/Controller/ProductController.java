package com.najaftech.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.najaftech.microservices.Model.ProductDTO;
import com.najaftech.microservices.Service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addNewProduct(@RequestBody ProductDTO product) {
        long productID = productService.addNewProduct(product);
        return new ResponseEntity<>(productID ,HttpStatus.CREATED);
    }


}
