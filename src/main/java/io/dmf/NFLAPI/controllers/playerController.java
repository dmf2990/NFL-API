package io.dmf.NFLAPI.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dmf.NFLAPI.Repository.PlayerRepository;
import io.dmf.NFLAPI.models.Player;

@RestController
@RequestMapping("/allPlayers")
public class playerController {

	@Resource
	PlayerRepository playerRepo;

	@GetMapping("")
	public Collection<Player> getAllPlayers() {
		return (Collection<Player>) playerRepo.findAll();
	}
}
