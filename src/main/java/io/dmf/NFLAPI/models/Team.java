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
public class Team {

		@Id
		@GeneratedValue
		private Long id;
		private String teamName;
		private String logo;
		
		private int rating;

		@OneToMany(mappedBy = "team")
		private Collection<Player> allPlayersForTeam = new HashSet<Player>();

		@JsonIgnore
		@ManyToOne
		private Division division;

		@ManyToMany
		private Collection<Stat> allStatsForTeam = new HashSet<Stat>();
		
		@OneToMany(mappedBy = "team")
		private Collection<Analysis> allAnalysisForTeam = new HashSet<Analysis>();

		public Team() {}

		public Team(String teamName, String logo, Division division) {
			this.teamName = teamName;
			this.logo = logo;
			this.division = division;
		}
		
		public void addStat(Stat stat) {
			allStatsForTeam.add(stat);
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

		public String getLogo() {
			return logo;
		}

		public Division getDivision() {
			return division;
		}
		
		public Collection<Player> getAllPlayersForTeam() {
			return allPlayersForTeam;
		}

		public Collection<Stat> getAllStatsForTeam() {
			return allStatsForTeam;
		}
		
		public Collection<Analysis> getAnalysis() {
			return allAnalysisForTeam;
		}

	}



