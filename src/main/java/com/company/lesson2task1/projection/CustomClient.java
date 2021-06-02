package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
