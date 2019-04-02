package io.dmf.NFLAPI.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Division {
	
	@Id
	@GeneratedValue
	private Long id;
	private String divName;
	
	
	private int rating;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "division")
	private Collection<Team> allTeams;
	
	@ManyToMany
	private Collection<Stat> allStats; 
	
	@OneToMany(mappedBy = "division")
	private Collection<Analysis> allAnalysis; 
	
	public Division() {} // JPA hook
	
	public Division(String divName) {
		this.divName = divName;
		this.allTeams = new ArrayList<>();

		//this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	
	//setter
	public void setRecord(int rating) {
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public String getDivName() {
		return divName;
	}

	
	public Collection<Team> getAllTeams() {
		return allTeams;
	}
	
	public void addStat(Stat stat) {
		allStats.add(stat);	
	}
	
	public void addTeam(Team team) {
		allTeams.add(team);
	}
	
	public Collection<Stat> getAllStats() {
		return allStats;
	}
	
	public Collection<Analysis> allAnalysis() {
		return allAnalysis;
	}

}


