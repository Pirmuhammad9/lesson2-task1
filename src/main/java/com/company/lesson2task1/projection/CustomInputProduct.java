package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Input;
import com.company.lesson2task1.entity.InputProduct;
import com.company.lesson2task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    String getAmount();
    double getPrice();
    String getExpireDate();
    Input getInput();
}
