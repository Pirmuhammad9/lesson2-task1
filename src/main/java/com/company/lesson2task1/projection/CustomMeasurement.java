package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String getName();
    boolean getActive();
}
