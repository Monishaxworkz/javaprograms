package com.xworkz.equality.dto;

import java.io.Serializable;

public class HockeyDTO implements Serializable{

	private String teamName;
	private Integer wins;
	private Integer loses;
	private String place;
	
	public HockeyDTO(String teamName, Integer wins, Integer loses, String place) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.loses = loses;
		this.place = place;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((wins==null)? 0 : wins.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("not null");
			if(obj instanceof HockeyDTO) {
				HockeyDTO hoc = (HockeyDTO)obj;
				
				if(this.getWins().equals(hoc.getWins())) {
					System.out.println("Is present" + getWins());
				}
			}
			else {
				System.out.println("Is not equal");
			}
		}
		return true;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getWins() {
		return wins;
	}
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	public Integer getLoses() {
		return loses;
	}
	public void setLoses(Integer loses) {
		this.loses = loses;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "HockeyDTO [teamName=" + teamName + ", wins=" + wins + ", loses=" + loses + ", place=" + place + "]";
	}
	
	
}
