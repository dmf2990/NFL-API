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
	
	Division division0 = divisionRepo.save(new Division("AFC NORTH"));
	Division division1 = divisionRepo.save(new Division("AFC SOUTH"));
	Division division2 = divisionRepo.save(new Division("AFC EAST"));
	Division division3 = divisionRepo.save(new Division("AFC WEST"));
	Division division4 = divisionRepo.save(new Division("NFC NORTH"));
	Division division5 = divisionRepo.save(new Division("NFC SOUTH"));
	Division division6 = divisionRepo.save(new Division("NFC EAST"));
	Division division7 = divisionRepo.save(new Division("NFC WEST"));
	
	Team team0 = teamRepo.save(new Team("Cleveland", "Browns", division0));
	Team team1 = teamRepo.save(new Team("Pittsburgh", "Steelers", division0));
	Team team2 = teamRepo.save(new Team("Baltimore", "Ravens", division0));
	Team team3 = teamRepo.save(new Team("Cincinnati", "Bangals", division0));
	
	Team team4 = teamRepo.save(new Team("Indianaplois", "Colts", division1));
	Team team5 = teamRepo.save(new Team("Houston", "Texans", division1));
	Team team6 = teamRepo.save(new Team("Jacksonville", "Jaguars", division1));
	Team team7 = teamRepo.save(new Team("Tennessee", "Titans", division1));
	
	Team team8 = teamRepo.save(new Team("New England", "Patriots", division2));
	Team team9 = teamRepo.save(new Team("New York", "Jets", division2));
	Team team10 = teamRepo.save(new Team("Miami", "Dolphins", division2));
	Team team11 = teamRepo.save(new Team("Buffalo", "Bills", division2));
	
	Team team12 = teamRepo.save(new Team("Denver", "Broncos", division3));
	Team team13 = teamRepo.save(new Team("Los Angeles", "Chargers", division3));
	Team team14 = teamRepo.save(new Team("Las Vegas", "Raiders", division3));
	Team team15 = teamRepo.save(new Team("Kansas City", "Chiefs", division3));
	
	Team team16 = teamRepo.save(new Team("Greenbay", "Packers", division4));
	Team team17 = teamRepo.save(new Team("Minnasota", "Vikings", division4));
	Team team18 = teamRepo.save(new Team("Chicago", "Bears", division4));
	Team team19 = teamRepo.save(new Team("Detroit", "Lions", division4));
	
	Team team20 = teamRepo.save(new Team("Carolina", "Panthers", division5));
	Team team21 = teamRepo.save(new Team("Tampa Bay", "Buccaneers", division5));
	Team team22 = teamRepo.save(new Team("New Orleans", "Saints", division5));
	Team team23 = teamRepo.save(new Team("Atlanta", "Falcons", division5));
	
	Team team24 = teamRepo.save(new Team("Dallas", "Cowboys", division6));
	Team team25 = teamRepo.save(new Team("Washinton", "Redskins", division6));
	Team team26 = teamRepo.save(new Team("New York", "Giants", division6));
	Team team27 = teamRepo.save(new Team("Philadelphia", "Eagles", division6));
	
	Team team28 = teamRepo.save(new Team("Arizona", "Cardinals", division7));
	Team team29 = teamRepo.save(new Team("Seattle", "Seahawks", division7));
	Team team30 = teamRepo.save(new Team("San Fransisco", "49ers", division7));
	Team team31 = teamRepo.save(new Team("Los Angeles", "Rams", division7));
	
	Player player0 = playerRepo.save(new Player("Jim Brown", "RunningBack", team0));
	Player player1 = playerRepo.save(new Player("Big Ben", "Quarterback", team1));
	Player player2 = playerRepo.save(new Player("Ed Reed", "Safety", team2));
	Player player3 = playerRepo.save(new Player("Corey Dillion", "RunningBack", team3));
	Player player4 = playerRepo.save(new Player("Peyton Manning", "Quarterback", team4));
	Player player5 = playerRepo.save(new Player("JJ Watt", "Defensive End", team5));
	Player player6 = playerRepo.save(new Player("Maurice Jones Drew", "RunningBack", team6));
	Player player7 = playerRepo.save(new Player("Marcus Mariotta", "Quarterback", team7));
	Player player8 = playerRepo.save(new Player("Rob Gronk", "Tightend", team8));
	Player player9 = playerRepo.save(new Player("Joe Namath", "Quarterback", team9));
	Player player10 = playerRepo.save(new Player("Ricky Williams", "RunningBack", team10));
	Player player11 = playerRepo.save(new Player("Tyrod Taylor", "Quarterback", team11));
	Player player12 = playerRepo.save(new Player("Von Miller", "Defensive End", team12));
	Player player13 = playerRepo.save(new Player("Antonio Gates", "Tightend", team13));
	Player player14 = playerRepo.save(new Player("Bo Jackson", "RunningBack", team14));
	Player player15 = playerRepo.save(new Player("Patrick Mahomes", "Quarterback", team15));
	Player player16 = playerRepo.save(new Player("Aaron Rodgers", "Quarterback", team16));
	Player player17 = playerRepo.save(new Player("Randy Moss", "Wideout", team17));
	Player player18 = playerRepo.save(new Player("Matt Forte", "RunningBack", team18));
	Player player19 = playerRepo.save(new Player("Barry Sanders", "Runningback", team19));
	Player player20 = playerRepo.save(new Player("Cam Newton", "Quarterback", team20));
	Player player21 = playerRepo.save(new Player("Warren Sapp", "Defensive End", team21));
	Player player22 = playerRepo.save(new Player("Drew Brees", "Quarterback", team22));
	Player player23 = playerRepo.save(new Player("Warrick Dunn", "RunningBack", team23));
	Player player24 = playerRepo.save(new Player("Prime Time", "Cornerback", team24));
	Player player25 = playerRepo.save(new Player("Kirk Cousins", "Quarterback", team25));
	Player player26 = playerRepo.save(new Player("Eli Manning", "Quarterback", team26));
	Player player27 = playerRepo.save(new Player("Donovan McNabb", "Quarterback", team27));
	Player player28 = playerRepo.save(new Player("Larry Fitz", "Wideout", team28));
	Player player29 = playerRepo.save(new Player("Russell Wilson", "Quarterback", team29));
	Player player30 = playerRepo.save(new Player("Ronny Lott", "Assassin", team30));
	Player player31 = playerRepo.save(new Player("Marshall Faulk", "RunningBack", team31));
	
	
	
	division0.addTeam(team0);
	divisionRepo.save(division0);
	
	division0.addTeam(team1);
	divisionRepo.save(division0);
	
	division0.addTeam(team2);
	divisionRepo.save(division0);
	
	division0.addTeam(team3);
	divisionRepo.save(division0);
	
	
	
	division1.addTeam(team4);
	divisionRepo.save(division1);
	
	division1.addTeam(team5);
	divisionRepo.save(division1);
	
	division1.addTeam(team6);
	divisionRepo.save(division1);
	
	division1.addTeam(team7);
	divisionRepo.save(division1);
	
	
	
	
	division2.addTeam(team8);
	divisionRepo.save(division2);
	
	division2.addTeam(team9);
	divisionRepo.save(division2);
	
	division2.addTeam(team10);
	divisionRepo.save(division2);
	
	division2.addTeam(team11);
	divisionRepo.save(division2);
	
	
	
	
	division3.addTeam(team12);
	divisionRepo.save(division3);
	
	division3.addTeam(team13);
	divisionRepo.save(division3);
	
	division3.addTeam(team14);
	divisionRepo.save(division3);
	
	division3.addTeam(team15);
	divisionRepo.save(division3);
	
	
	
	division4.addTeam(team16);
	divisionRepo.save(division4);
	
	division4.addTeam(team17);
	divisionRepo.save(division4);
	
	division4.addTeam(team18);
	divisionRepo.save(division4);

	division4.addTeam(team19);
	divisionRepo.save(division4);
	
	
	
	division5.addTeam(team20);
	divisionRepo.save(division5);
	
	division5.addTeam(team21);
	divisionRepo.save(division5);
	
	division5.addTeam(team22);
	divisionRepo.save(division5);
	
	division5.addTeam(team23);
	divisionRepo.save(division5);
	
	
	
	
	division6.addTeam(team24);
	divisionRepo.save(division6);
	
	division6.addTeam(team25);
	divisionRepo.save(division6);
	
	division6.addTeam(team26);
	divisionRepo.save(division6);
	
	division6.addTeam(team27);
	divisionRepo.save(division6);
	
	
	
	
	division7.addTeam(team28);
	divisionRepo.save(division7);
	
	division7.addTeam(team29);
	divisionRepo.save(division7);
	
	division7.addTeam(team30);
	divisionRepo.save(division7);

	division7.addTeam(team31);
	divisionRepo.save(division7);
	
	
	
	
	
	team0.addPlayer(player0);
	teamRepo.save(team0);
	
	team1.addPlayer(player1);
	teamRepo.save(team1);

	team2.addPlayer(player2);
	teamRepo.save(team2);
	
	team3.addPlayer(player3);
	teamRepo.save(team3);

	team4.addPlayer(player4);
	teamRepo.save(team4);
	
	team5.addPlayer(player5);
	teamRepo.save(team5);

	team6.addPlayer(player6);
	teamRepo.save(team6);
	
	team7.addPlayer(player7);
	teamRepo.save(team7);

	team8.addPlayer(player8);
	teamRepo.save(team8);
	
	team9.addPlayer(player9);
	teamRepo.save(team9);
	
	team10.addPlayer(player10);
	teamRepo.save(team10);
	
	team11.addPlayer(player11);
	teamRepo.save(team11);

	team12.addPlayer(player12);
	teamRepo.save(team12);
	
	team13.addPlayer(player13);
	teamRepo.save(team13);

	team14.addPlayer(player14);
	teamRepo.save(team14);
	
	team15.addPlayer(player15);
	teamRepo.save(team5);

	team16.addPlayer(player16);
	teamRepo.save(team16);
	
	team17.addPlayer(player17);
	teamRepo.save(team17);

	team18.addPlayer(player18);
	teamRepo.save(team18);
	
	team19.addPlayer(player19);
	teamRepo.save(team19);
	
	team20.addPlayer(player20);
	teamRepo.save(team20);
	
	team21.addPlayer(player21);
	teamRepo.save(team21);

	team22.addPlayer(player22);
	teamRepo.save(team22);
	
	team23.addPlayer(player23);
	teamRepo.save(team3);

	team24.addPlayer(player24);
	teamRepo.save(team24);
	
	team25.addPlayer(player25);
	teamRepo.save(team25);

	team26.addPlayer(player26);
	teamRepo.save(team26);
	
	team27.addPlayer(player27);
	teamRepo.save(team27);

	team28.addPlayer(player28);
	teamRepo.save(team8);
	
	team29.addPlayer(player29);
	teamRepo.save(team29);

	team30.addPlayer(player30);
	teamRepo.save(team8);
	
	team31.addPlayer(player31);
	teamRepo.save(team31);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	team2.addPlayer(player3);
//	team2.addPlayer(player4);
	
	team2 = teamRepo.save(team2);
	
	
//	Division division4 = divisionRepo.save(new Division("NFC NORTH"));
//	Team team4 = teamRepo.save(new Team("team4", "whatever", division4));
//	Player player4 = playerRepo.save(new Player("Prime Time", "CornerBack", team0));

	
	Stat stat1 = statRepo.save(new Stat("12"));
	Stat stat2 = statRepo.save(new Stat("12"));
	Stat stat3 = statRepo.save(new Stat("12"));
	Stat stat4 = statRepo.save(new Stat("12"));

	Analysis analysis1 = analysisRepo.save(new Analysis("65", "34"));
	Analysis analysis2 = analysisRepo.save(new Analysis("56", "3"));
	Analysis analysis3 = analysisRepo.save(new Analysis("65", "34"));
	Analysis analysis4 = analysisRepo.save(new Analysis("56", "34"));
	
	
	
//	// add analysis -- to player, division, team -- comment
//	analysis1.addPlayer(player1);
//	analysis1 = analysisRepo.save(analysis1);
//	
//	analysis2.addTeam(team2);
//	analysis2 = analysisRepo.save(analysis2);
//	
//	analysis3.addDivision(division3);
//	analysis3 = analysisRepo.save(analysis3);
}
}
