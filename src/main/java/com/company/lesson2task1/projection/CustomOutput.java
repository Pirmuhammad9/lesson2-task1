package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Client;
import com.company.lesson2task1.entity.Currency;
import com.company.lesson2task1.entity.Output;
import com.company.lesson2task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    String getDate();
    Warehouse getWarehouse();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
    Client getClient();
}
