package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Measurement;
import com.company.lesson2task1.entity.Supplier;
import com.company.lesson2task1.projection.CustomMeasurement;
import com.company.lesson2task1.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
