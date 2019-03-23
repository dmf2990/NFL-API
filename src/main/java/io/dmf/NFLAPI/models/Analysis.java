package io.dmf.NFLAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Analysis {
	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String content;

	@JsonIgnore
	@ManyToOne
	private Division division;

	@JsonIgnore
	@ManyToOne
	private Team team;

	@JsonIgnore
	@ManyToOne
	private Player player;

	public Analysis() {}

	public Analysis(String userName, String content) {
		this.userName = userName;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getContent() {
		return content;
	}

	public Division getDivision() {
		return division;
	}

	public Team getTeam() {
		return team;
	}

	public Player getPlayer() {
		return player;
	}

	public void addPlayer(Player player) {
		this.player = player;
	}

	public void addDivision(Division division) {
		this.division = division;
	}

	public void addTeam(Team team) {
		this.team = team;
	}
	
	
}
