package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Attachment;
import com.company.lesson2task1.entity.Category;
import com.company.lesson2task1.entity.Measurement;
import com.company.lesson2task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getAttachment();
    String getCode();
    Measurement getMeasurement();
    boolean getActive();
}
