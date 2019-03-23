package io.dmf.NFLAPI.models;

import java.util.Collection;
import java.util.HashSet;

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
	private String location;
	private String conference;
	
	private int rating;
	
	@OneToMany(mappedBy = "division")
	private Collection<Team> allTeamsInDivision = new HashSet<>();
	
	@ManyToMany
	private Collection<Stat> allStatsForDivision = new HashSet<>();
	
	@OneToMany(mappedBy = "division")
	private Collection<Analysis> allDivAnalysis = new HashSet<>();
	
	public Division() {} // JPA hook
	
	public Division(String divName, String location, String conference) {
		this.divName = divName;
		this.location = location;
		this.conference = conference;
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

	public String getLocation() {
		return location;
	}

	public String getConference() {
		return conference;
	}
	
	public Collection<Team> getAllTeamsInDivision() {
		return allTeamsInDivision;
	}
	
	public void addStat(Stat stat) {
		allStatsForDivision.add(stat);	
	}
	
	public Collection<Stat> getAllStatsForDivision() {
		return allStatsForDivision;
	}
	
	public Collection<Analysis> allDivAnalysis() {
		return allDivAnalysis;
	}

}


