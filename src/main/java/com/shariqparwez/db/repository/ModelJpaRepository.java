package com.shariqparwez.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shariqparwez.db.model.Model;

public interface ModelJpaRepository extends JpaRepository<Model, Long> {

}
