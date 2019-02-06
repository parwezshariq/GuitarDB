package com.shariqparwez.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shariqparwez.db.model.Location;

public interface LocationJpaRepository extends JpaRepository<Location, Long> {

}
