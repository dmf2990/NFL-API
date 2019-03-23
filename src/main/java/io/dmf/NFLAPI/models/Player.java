package io.dmf.NFLAPI.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private Long id;

	private String playerName;
	private String playerPosition;
	
	private int rating;
	
	// stops recursion & stack overflow - if put on both sides kills relationship
	// unilateral - must have this on one of the two songs or album
	@JsonIgnore // ** so now will access songs thru album.
	@ManyToOne  
	private Team team;

	@ManyToMany
	private Collection<Stat> allStats = new HashSet<>();

	@OneToMany(mappedBy = "player")
	private Collection<Analysis> allAnalysis = new HashSet<>();

	public Player() {
	}

	public Player(String playerName, String playerPosition, Team team) {
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.team = team;
	}

	public void addStat(Stat stat) {
		allStats.add(stat);
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
 	
	public Long getId() {
		return id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public int getRating() {
		return rating;
	}

	public Team getTeam() {
		return team;
	}

	public Collection<Stat> getAllStats() {
		return allStats;
	}

	public Collection<Analysis> getAllAnalysis() {
		return allAnalysis;
	}
}
