package mechanics;

public class building {
private int goldPerTurn;
private int menPerTurn;
private int currentHealth;
private int baseHealth;
private int price;
private int upgrades;
private boolean useManpower;
public int getGoldPerTurn() {
	return goldPerTurn;
}
public void setGoldPerTurn(int goldPerTurn) {
	this.goldPerTurn = goldPerTurn;
}
public int getMenPerTurn() {
	return menPerTurn;
}
public void setMenPerTurn(int menPerTurn) {
	this.menPerTurn = menPerTurn;
}
public int getCurrentHealth() {
	return currentHealth;
}
public void setCurrentHealth(int currentHealth) {
	this.currentHealth = currentHealth;
}
public int getBaseHealth() {
	return baseHealth;
}
public void setBaseHealth(int baseHealth) {
	this.baseHealth = baseHealth;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getUpgrades() {
	return upgrades;
}
public void setUpgrades(int upgrades) {
	this.upgrades = upgrades;
}
public boolean isUseManpower() {
	return useManpower;
}
public void setUseManpower(boolean useManpower) {
	this.useManpower = useManpower;
}

}
