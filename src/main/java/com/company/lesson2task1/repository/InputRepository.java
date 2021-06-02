package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Input;
import com.company.lesson2task1.entity.Warehouse;
import com.company.lesson2task1.projection.CustomInput;
import com.company.lesson2task1.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
