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
@RequestMapping("/allTeams")
public class TeamController {

	@Resource
	TeamRepository teamRepo;

	@GetMapping("")
	public Collection<Team> getAllTeams() {
		return (Collection<Team>) teamRepo.findAll();
	}
	
	// reqBody - so controller knows how to handle data / body (json)
	// library to help parse json - JSONObject (org.json.jsonobject)
	// "teamName" is key, "mascot" is value in js 
	// using js to send info thru http request
	@PostMapping("/add")
	public Collection<Team> addTeam(@RequestBody String body) throws JSONException {
		// grab and package json object
		JSONObject json = new JSONObject(body);
		String teamName = json.getString("teamName"); // connects us to js post request
		String mascot = json.getString("mascot"); // connects us to post request
		
		//////////// HOW TO PASS OBJECT HERE for DIVISION????????????????
		
		// make/save this object in repo
		teamRepo.save(new Team(teamName, mascot, null));
		
		// returning collection of teams
		return (Collection<Team>) teamRepo.findAll();
	}
}
