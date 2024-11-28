package com.example.CloudDataFlow.config;

import com.example.CloudDataFlow.entity.Product;
import com.example.CloudDataFlow.repository.ProductRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductWriter implements ItemWriter<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void write(Chunk<? extends Product> chunk) throws Exception {
        for (Product prd : chunk) {
            System.out.println("Writer    : Writing data    : " + prd.getId()+" : "+prd.getName()+" : "+prd.getPrice());
            productRepository.save(prd);
        }
    }
}
