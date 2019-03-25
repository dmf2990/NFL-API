package io.dmf.NFLAPI.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/add")
	public Collection<Team> addTeam(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String teamName = json.getString("teamName");
		String mascot = json.getString("mascot");
		teamRepo.save(new Team(teamName, mascot, null));
		return (Collection<Team>) teamRepo.findAll();
	}
}
