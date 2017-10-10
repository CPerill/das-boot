package com.perill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perill.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
	
}
