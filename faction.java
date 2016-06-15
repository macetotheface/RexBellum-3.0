package mechanics;

public class faction {
private int manpower;
private int gold;
private int happiness;
private int income;
private int manpowerIncome;
private int numOfUnits;
private boolean isPlayer;


public boolean isPlayer() {
	return isPlayer;
}
public void setPlayer(boolean isPlayer) {
	this.isPlayer = isPlayer;
}
public int getManpower() {
	return manpower;
}
public void setManpower(int manpower) {
	this.manpower = manpower;
}
public int getGold() {
	return gold;
}
public void setGold(int gold) {
	this.gold = gold;
}
public int getHappiness() {
	return happiness;
}
public void setHappiness(int happiness) {
	this.happiness = happiness;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public int getManpowerIncome() {
	return manpowerIncome;
}
public void setManpowerIncome(int manpowerIncome) {
	this.manpowerIncome = manpowerIncome;
}
public int getNumOfUnits() {
	return numOfUnits;
}
public void setNumOfUnits(int numOfUnits) {
	this.numOfUnits = numOfUnits;
}


}
