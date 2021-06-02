package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Users.class)
public interface CustomUsers {
    Integer getId();
    String getFirstname();
    String getLastname();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
}
