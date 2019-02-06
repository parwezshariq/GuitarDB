package com.shariqparwez.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shariqparwez.db.model.Location;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

}
