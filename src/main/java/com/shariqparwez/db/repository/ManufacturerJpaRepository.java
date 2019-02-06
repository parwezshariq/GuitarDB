package com.shariqparwez.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shariqparwez.db.model.Manufacturer;

public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {

}
