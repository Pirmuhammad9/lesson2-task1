package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
