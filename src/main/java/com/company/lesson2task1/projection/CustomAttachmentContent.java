package com.company.lesson2task1.projection;

import com.company.lesson2task1.entity.Attachment;
import com.company.lesson2task1.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
