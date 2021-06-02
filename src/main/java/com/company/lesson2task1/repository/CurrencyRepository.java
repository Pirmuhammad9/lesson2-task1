package com.company.lesson2task1.repository;

import com.company.lesson2task1.entity.Category;
import com.company.lesson2task1.entity.Currency;
import com.company.lesson2task1.projection.CustomClient;
import com.company.lesson2task1.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
