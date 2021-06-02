package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Currency;
import com.company.lesson2task1.entity.Input;
import com.company.lesson2task1.entity.Supplier;
import com.company.lesson2task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    String getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactoreName();
    String getCode();
}
