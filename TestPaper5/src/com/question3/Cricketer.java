/*Create a java class Cricketer. Class has int playerid, String name , Boolean isBaller , float strikerate , int runs. All fields are private. Write getter setter for all fields of this class*/
package com.question3;

public class Cricketer {
	private int playerid;
	private String name;
	private boolean isBaller;
	private float strikeRate;
	private int runs;

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIsBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public boolean getIsBaller() {
		return isBaller;
	}

	public float getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

}