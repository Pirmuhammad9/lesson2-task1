package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    boolean getActive();
}
