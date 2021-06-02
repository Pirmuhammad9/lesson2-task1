package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Category;
import com.company.lesson2task1.entity.Measurement;
import com.company.lesson2task1.projection.CustomCurrency;
import com.company.lesson2task1.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
