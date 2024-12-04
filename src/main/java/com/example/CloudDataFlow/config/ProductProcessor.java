package com.example.CloudDataFlow.config;

import com.example.CloudDataFlow.entity.Product;
import org.springframework.batch.item.ItemProcessor;
public class ProductProcessor implements ItemProcessor<Product,Product> {
    @Override
    public Product process(Product item) {
//        if(Long.valueOf(item.getPrice()) > 20000){
//            return item;
//        }
        Product prd = new Product();
        prd.setId(item.getId());
        prd.setName(item.getName());
        prd.setPrice((long) (item.getPrice()  +500 ));
        return prd;
    }

}