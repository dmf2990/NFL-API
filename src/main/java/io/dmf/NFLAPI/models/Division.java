package io.dmf.NFLAPI.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Division {
	
	@Id
	@GeneratedValue
	private Long id;
	private String divName;
	private String conference;
	
	
	private int rating;
	
	@JsonIgnore
	@OneToMany(mappedBy = "division")
	private Collection<Team> allTeams;
	
	@ManyToMany
	private Collection<Stat> allStats; 
	
	@OneToMany(mappedBy = "division")
	private Collection<Analysis> allAnalysis; 
	
	public Division() {} // JPA hook
	
	public Division(String divName) {
		this.divName = divName;

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
	
	public Collection<Stat> getAllStats() {
		return allStats;
	}
	
	public Collection<Analysis> allAnalysis() {
		return allAnalysis;
	}

}


