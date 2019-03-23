package io.dmf.NFLAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import io.dmf.NFLAPI.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}
