package io.dmf.NFLAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import io.dmf.NFLAPI.models.Player;

public interface PlayerRepository extends CrudRepository <Player, Long>{

}
