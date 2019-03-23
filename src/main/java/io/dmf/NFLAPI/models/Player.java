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
	private String playerAge;
	
	private int rating;
	
	// stops recursion & stack overflow - if put on both sides kills relationship
	// unilateral - must have this on one of the two songs or album
	@JsonIgnore // ** so now will access songs thru album.
	@ManyToOne  
	private Team team;

	@ManyToMany
	private Collection<Stat> allStatsForPlayer = new HashSet<>();

	@OneToMany(mappedBy = "song")
	private Collection<Analysis> allAnalysisForPlayer = new HashSet<>();

	public Player() {
	}

	public Player(String playerName, String playerAge, Team team) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.team = team;
	}

	public void addStat(Stat stat) {
		allStatsForPlayer.add(stat);
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

	public String getPlayerAge() {
		return playerAge;
	}

	public int getRating() {
		return rating;
	}

	public Team getTeam() {
		return team;
	}

	public Collection<Stat> getAllStatsForPlayer() {
		return allStatsForPlayer;
	}

	public Collection<Analysis> getAllAnalysisForPlayer() {
		return allAnalysisForPlayer;
	}
}
