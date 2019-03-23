package io.dmf.NFLAPI.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dmf.NFLAPI.Repository.TeamRepository;
import io.dmf.NFLAPI.models.Team;

@RestController
@RequestMapping("/teams")
public class TeamController {

	@Resource
	TeamRepository teamRepo;

	@GetMapping("")
	public Collection<Team> getAllTeams() {
		return (Collection<Team>) teamRepo.findAll();

	}
}
