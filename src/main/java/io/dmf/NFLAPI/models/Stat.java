package io.dmf.NFLAPI.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Stat {

	@Id
	@GeneratedValue
	private Long id;
	private String statName;

	@ManyToMany
	private Collection<Division> allDivisionsStats = new HashSet<Division>();

	@ManyToMany
	private Collection<Team> allTeamsStats = new HashSet<Team>();

	@ManyToMany
	private Collection<Player> allPlayersStats = new HashSet<Player>();

	public Stat() {}

	public void addPlayer(Player player) {
		allPlayersStats.add(player);
	}
	
	public void addDivison(Division division) {
		allDivisionsStats.add(division);
	}
	
	public void addTeam(Team team) {
		allTeamsStats.add(team);
	}
	
	public Stat(String statName) {
		this.statName = statName;
	}

	public Long getId() {
		return id;
	}

	public String getStatName() {
		return statName;
	}

	public Collection<Division> getAllDivisionsStats() {
		return allDivisionsStats;
	}

	public Collection<Team> getTeam() {
		return allTeamsStats;
	}

	public Collection<Player> getPlayer() {
		return allPlayersStats;
	}
}
