package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.OutputProduct;
import com.company.lesson2task1.entity.Product;
import com.company.lesson2task1.projection.CustomOutputProduct;
import com.company.lesson2task1.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
