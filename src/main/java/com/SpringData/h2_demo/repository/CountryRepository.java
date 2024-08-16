package com.SpringData.h2_demo.repository;

import com.SpringData.h2_demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
