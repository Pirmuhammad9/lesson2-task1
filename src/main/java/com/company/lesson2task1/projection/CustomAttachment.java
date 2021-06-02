package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    Double getSize();
    String getContentType();
}
