package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Attachment;
import com.company.lesson2task1.entity.Category;
import com.company.lesson2task1.projection.CustomAttachment;
import com.company.lesson2task1.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
