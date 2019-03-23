package io.dmf.NFLAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import io.dmf.NFLAPI.models.Stat;

public interface StatRepository extends CrudRepository<Stat, Long>{

	Stat findStatByStatName(String statName);
	
}
