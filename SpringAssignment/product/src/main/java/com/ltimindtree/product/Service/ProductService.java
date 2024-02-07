package com.ltimindtree.product.Service;

import java.util.List;

import com.ltimindtree.product.entity.Product;

public interface ProductService {
    public List<Product> findAll();
    public Product findOne();
}
