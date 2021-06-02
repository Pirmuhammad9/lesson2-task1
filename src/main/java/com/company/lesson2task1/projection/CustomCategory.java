package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    boolean getActive();
}
