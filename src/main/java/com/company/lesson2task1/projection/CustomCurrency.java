package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean getActive();
}
