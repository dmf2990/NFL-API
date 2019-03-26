package io.dmf.NFLAPI.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Team {

		@Id
		@GeneratedValue
		private Long id;
		private String teamName;
		private String mascot;
		
		private int rating;

		@OneToMany(mappedBy = "team")
		private Collection<Player> allPlayers; // = new HashSet<Player>();

		@JsonIgnore
		@ManyToOne
		private Division division;

		@ManyToMany
		private Collection<Stat> allStats; // = new HashSet<Stat>();
		
		@OneToMany(mappedBy = "team")
		private Collection<Analysis> allAnalysis; // = new HashSet<Analysis>();

		public Team() {}

		public Team(String teamName, String mascot, Division division) {
			this.teamName = teamName;
			this.mascot = mascot;
			this.division = division;
			this.allPlayers = new ArrayList<Player>();//need this collection to add to data base
		}
		
		public void addStat(Stat stat) {
			allStats.add(stat);
		}
		
		// setter
		public void setRating(int rating) {
			this.rating = rating;
		}

		public int getRating() {
			return rating;
		}

		public Long getId() {
			return id;
		}

		public String getTeamName() {
			return teamName;
		}

		public String getMascot() {
			return mascot;
		}

		public Division getDivision() {
			return division;
		}
		
		public void addPlayer (Player player) {
			allPlayers.add(player);
		}
		
		public Collection<Player> getAllPlayers() {
			return allPlayers;
		}

		public Collection<Stat> getAllStats() {
			return allStats;
		}
		
		public Collection<Analysis> getAllAnalysis() {
			return allAnalysis;
		}

	}



