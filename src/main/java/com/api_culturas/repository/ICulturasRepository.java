package com.api_culturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api_culturas.domain.Culturas;


@Repository
public interface ICulturasRepository extends JpaRepository<Culturas, Long>{
	
	
}
