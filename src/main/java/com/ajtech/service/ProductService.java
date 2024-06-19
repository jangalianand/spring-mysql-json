package com.ajtech.service;

import com.ajtech.entity.Product;
import com.ajtech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public String saveProduct(String json){

        Product product=new Product();
        product.setProductDetails(json);
        productRepository.save(product);

        return "product save successfully";
    }
}
