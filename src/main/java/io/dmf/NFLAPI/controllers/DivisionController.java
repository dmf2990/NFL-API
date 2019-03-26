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

import io.dmf.NFLAPI.Repository.DivisionRepository;
import io.dmf.NFLAPI.models.Division;


@RestController
@RequestMapping("/allDivisions")
public class DivisionController {
	
	@Resource
	DivisionRepository divisionRepo;
	
	@GetMapping("")
	public Collection<Division> getAllDivisions(){
		return (Collection<Division>) divisionRepo.findAll();
	}
	
	@PostMapping("/add")
	public Collection<Division> addDivision(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String divisionName = json.getString("divisionName");
		String conference = json.getString("conference");
		//int rating = Integer.parseInt(json.getString("rating"));
		
		divisionRepo.save(new Division(divisionName, conference));
		
		return (Collection<Division>) divisionRepo.findAll();
	}

}
