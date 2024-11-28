package com.example.CloudDataFlow.config;


import com.example.CloudDataFlow.entity.Product;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


public class ProductProcessor implements ItemProcessor<Product,Product> {
//    @Override
//    public Product process(Product item) throws Exception {
//        if(Long.valueOf(item.getPrice()) > 20000){
//            return item;
//        }
//        return null;
//    }

    @Override
    public Product process(Product item) throws Exception {

        Product prd = new Product();

        prd.setId(item.getId());
        prd.setName(item.getName());
        prd.setPrice(item.getPrice());

        return prd;
    }

}