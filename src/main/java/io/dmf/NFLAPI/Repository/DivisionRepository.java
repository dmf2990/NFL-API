package io.dmf.NFLAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import io.dmf.NFLAPI.models.Division;

public interface DivisionRepository extends CrudRepository<Division, Long> {

	Division findByDivName(String string);


}
