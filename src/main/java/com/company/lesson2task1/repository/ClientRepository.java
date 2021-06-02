package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Category;
import com.company.lesson2task1.entity.Client;
import com.company.lesson2task1.projection.CustomCategory;
import com.company.lesson2task1.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
