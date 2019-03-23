package io.dmf.NFLAPI.controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import io.dmf.NFLAPI.Repository.AnalysisRepository;
import io.dmf.NFLAPI.Repository.DivisionRepository;
import io.dmf.NFLAPI.Repository.PlayerRepository;
import io.dmf.NFLAPI.Repository.StatRepository;
import io.dmf.NFLAPI.Repository.TeamRepository;

@CrossOrigin
@RestController
public class HomeController {

	@Resource
	PlayerRepository playerRepo;
	
	@Resource
	TeamRepository teamRepo;
	
	@Resource
	DivisionRepository divisionRepo;
	
	@Resource
	StatRepository statRepo;
	
	@Resource 
	AnalysisRepository analysisRepo;
	
	
}
