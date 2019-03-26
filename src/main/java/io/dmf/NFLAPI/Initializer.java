package io.dmf.NFLAPI;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import io.dmf.NFLAPI.Repository.AnalysisRepository;
import io.dmf.NFLAPI.Repository.DivisionRepository;
import io.dmf.NFLAPI.Repository.PlayerRepository;
import io.dmf.NFLAPI.Repository.StatRepository;
import io.dmf.NFLAPI.Repository.TeamRepository;
import io.dmf.NFLAPI.models.Analysis;
import io.dmf.NFLAPI.models.Division;
import io.dmf.NFLAPI.models.Player;
import io.dmf.NFLAPI.models.Stat;
import io.dmf.NFLAPI.models.Team;

@Service
public class Initializer implements CommandLineRunner {

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

@Override
public void run(String... args) throws Exception {
	
	Division division0 = divisionRepo.save(new Division("SOUTH", "AFC"));
	Team team0 = teamRepo.save(new Team("team0", "falcon", division0));
	Player player0 = playerRepo.save(new Player("Prime Time", "CornerBack", team0));
	
	Division division1 = divisionRepo.save(new Division("NORTH", "NFC"));
	Team team1 = teamRepo.save(new Team("team1", "49ers", division1));
	Player player1 = playerRepo.save(new Player("Ronny Lot", "HumanCannon", team1));
	
	Division division2 = divisionRepo.save(new Division("SOUTH", "AFC"));
	Team team2 = teamRepo.save(new Team("team2", "raider", division2));
	Player player2 = playerRepo.save(new Player("Bo Jackson", "RunningBack", team2));
	
	Division division3 = divisionRepo.save(new Division("NORTH", "AFC"));
	Team team3 = teamRepo.save(new Team("team3", "dawgs", division3));
	Player player3 = playerRepo.save(new Player("Baker Mayfield", "Quarterback", team2));
	
	Division division4 = divisionRepo.save(new Division("EAST", "NFC"));
	Team team4 = teamRepo.save(new Team("team4", "whatever", division4));
	Player player4 = playerRepo.save(new Player("Prime Time", "CornerBack", team0));

	
	Stat stat1 = statRepo.save(new Stat("12"));
	Stat stat2 = statRepo.save(new Stat("12"));
	Stat stat3 = statRepo.save(new Stat("12"));
	Stat stat4 = statRepo.save(new Stat("12"));

	Analysis analysis1 = analysisRepo.save(new Analysis("65", "34"));
	Analysis analysis2 = analysisRepo.save(new Analysis("56", "3"));
	Analysis analysis3 = analysisRepo.save(new Analysis("65", "34"));
	Analysis analysis4 = analysisRepo.save(new Analysis("56", "34"));
		
	// add stat -- to player, division, team
	player1.addStat(stat1);
	player1 = playerRepo.save(player1);
	
	division1.addStat(stat2);
	division1 = divisionRepo.save(division1);	
	
	team0.addStat(stat3);
	team0 = teamRepo.save(team0);
	
	// add analysis -- to player, division, team -- comment
	analysis1.addPlayer(player1);
	analysis1 = analysisRepo.save(analysis1);
	
	analysis2.addTeam(team2);
	analysis2 = analysisRepo.save(analysis2);
	
	analysis3.addDivision(division3);
	analysis3 = analysisRepo.save(analysis3);
}
}
