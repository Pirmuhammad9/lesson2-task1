package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Output;
import com.company.lesson2task1.entity.OutputProduct;
import com.company.lesson2task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    String getAmount();
    double getPrice();
    Output getOutput();
}
