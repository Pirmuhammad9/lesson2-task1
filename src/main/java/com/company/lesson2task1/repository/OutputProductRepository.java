package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Output;
import com.company.lesson2task1.entity.OutputProduct;
import com.company.lesson2task1.projection.CustomOutput;
import com.company.lesson2task1.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
