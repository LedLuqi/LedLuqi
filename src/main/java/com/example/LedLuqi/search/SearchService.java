package com.example.LedLuqi.search;

import com.example.LedLuqi.product.Product;
import com.example.LedLuqi.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SearchService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> products(Search search){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(productRepository.findByNameOfProductContains(search.getSearched()));
        products.addAll(productRepository.findByDescriptionContains(search.getSearched()));
        return products;
    }
}
