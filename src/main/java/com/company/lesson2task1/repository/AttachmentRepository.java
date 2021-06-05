package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
