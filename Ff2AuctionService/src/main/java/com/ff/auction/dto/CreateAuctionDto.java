package com.ff.auction.dto;

public class CreateAuctionDto {
	private String leagueName;
	private String budget;
	private String pPR;
	private String maxPlayers;

	public CreateAuctionDto() {}


	public String getLeagueName() {
		return leagueName;
	}


	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}


	public String getPPR() {
		return pPR;
	}


	public void setPPR(String pPR) {
		this.pPR = pPR;
	}


	public String getMaxPlayers() {
		return maxPlayers;
	}


	public void setMaxPlayers(String maxPlayers) {
		this.maxPlayers = maxPlayers;
	};

	
}
