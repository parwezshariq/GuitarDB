package com.shariqparwez.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shariqparwez.db.model.Model;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {

}
