package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
