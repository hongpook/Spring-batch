package com.example.CloudDataFlow.config;

import com.example.CloudDataFlow.entity.Product;
import com.example.CloudDataFlow.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j

public class ProductWriter implements ItemWriter<Product> {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void write(Chunk<? extends Product> chunk){
        for (Product prd : chunk) {
            log.info("Writing data    : " + prd.getId()+" : "+prd.getName()+" : "+prd.getPrice());
            productRepository.save(prd);
        }
    }
}
