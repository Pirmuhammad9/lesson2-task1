package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Supplier;
import com.company.lesson2task1.entity.Users;
import com.company.lesson2task1.projection.CustomSupplier;
import com.company.lesson2task1.projection.CustomUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
