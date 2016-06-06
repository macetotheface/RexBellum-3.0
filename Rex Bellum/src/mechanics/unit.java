package mechanics;

public class unit {

private int factionType;// 1-human, 2-elf, 3-dwarf, 4-orc
//private int empireHappines;// the happiness of the players empire.
private int baseHealth; //the base health of the unit
private int baseAttack; //the base attack for the unit
private int baseMoves; //the base number of moves for the unit
private int baseRange; //the range of the unit

private int currentHealth; //the current health of the unit
private int currentAttack; //the current attack for the unit
private int currentMoves; //the current number of moves for the unit
private int currentRange; //the current number of range for the unit



private double flankMod; //the flank modifier for the unit
private int moveMod; //the sum of the buffs and debuffs of the unit moves

private int combatants; //number of in the flank

//private image unitArt;


/**
 * @return the combatants
 */
public int getCombatants() {
	return combatants;
}

/**
 * @param combatants the combatants to set
 */
public void setCombatants(int combatants) {
	this.combatants = combatants;
}

/**
 * @return the baseHealth
 */
public int getBaseHealth() {
	return baseHealth;
}

/**
 * @param baseHealth the baseHealth to set
 */
public void setBaseHealth(int baseHealth) {
	this.baseHealth = baseHealth;
}

/**
 * @return the baseAttack
 */
public int getBaseAttack() {
	return baseAttack;
}

/**
 * @param baseAttack the baseAttack to set
 */
public void setBaseAttack(int baseAttack) {
	this.baseAttack = baseAttack;
}

/**
 * @return the baseMoves
 */
public int getBaseMoves() {
	return baseMoves;
}

/**
 * @param baseMoves the baseMoves to set
 */
public void setBaseMoves(int baseMoves) {
	this.baseMoves = baseMoves;
}

/**
 * @return the baseRange
 */
public int getBaseRange() {
	return baseRange;
}

/**
 * @param baseRange the baseRange to set
 */
public void setBaseRange(int baseRange) {
	this.baseRange = baseRange;
}

/**
 * @return the currentHealth
 */
public int getCurrentHealth() {
	return currentHealth;
}

/**
 * @param currentHealth the currentHealth to set
 */
public void setCurrentHealth(int currentHealth) {
	this.currentHealth = currentHealth;
}

/**
 * @return the currentAttack
 */
public int getCurrentAttack() {
	return currentAttack;
}

/**
 * @param currentAttack the currentAttack to set
 */
public void setCurrentAttack(int currentAttack) {
	this.currentAttack = currentAttack;
}

/**
 * @return the currentMoves
 */
public int getCurrentMoves() {
	return currentMoves;
}

/**
 * @param currentMoves the currentMoves to set
 */
public void setCurrentMoves(int currentMoves) {
	this.currentMoves = currentMoves;
}

/**
 * @return the currentRange
 */
public int getCurrentRange() {
	return currentRange;
}

/**
 * @param currentRange the currentRange to set
 */
public void setCurrentRange(int currentRange) {
	this.currentRange = currentRange;
}

/**
 * @return the flankMod
 */
public double getFlankMod() {
	return flankMod;
}

/**
 * @param flankMod the flankMod to set
 */
public void setFlankMod(double flankMod) {
	this.flankMod = flankMod;
}

/**
 * @return the moveMod
 */
public int getMoveMod() {
	return moveMod;
}

/**
 * @param moveMod the moveMod to set
 */
public void setMoveMod(int moveMod) {
	this.moveMod = moveMod;
}

/**
 * @return the factionType
 */
public int getFactionType() {
	return factionType;
}

/**
 * @param factionType the factionType to set
 */
public void setFactionType(int factionType) {
	this.factionType = factionType;
}



}
