package io.dmf.NFLAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import io.dmf.NFLAPI.models.Analysis;

public interface AnalysisRepository extends CrudRepository<Analysis, Long>{

}
