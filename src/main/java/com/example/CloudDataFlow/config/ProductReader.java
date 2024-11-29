package com.example.CloudDataFlow.config;

import com.example.CloudDataFlow.entity.Product;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductReader extends JdbcCursorItemReader<Product> implements ItemReader<Product> {
    public void reader(@Autowired DataSource dataSource) {
        setDataSource(dataSource);
        setSql("SELECT * FROM Product");
        setFetchSize(10);
        setRowMapper(new ProductRowMapper());
    }

    public class ProductRowMapper implements RowMapper<Product> {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product  = new Product();

            product.setId(rs.getLong("id"));
            product.setName(rs.getString("name"));
            product.setPrice(rs.getLong("price"));

            return product;
        }
}}

