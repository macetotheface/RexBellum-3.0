package mechanics;

public class faction {

	private int manpower;
	private int gold;
	private int happiness;
	private int income;
	private int manpowerIncome;
	private int numOfUnits;
	private barracks barrackStats;
	private farm farmStats;
	private market marketStats;
	private boolean isPlayer;
	private int decisionMade;// 0 = none, 1 = buildUnits, 2 = buildMarkets, 3 = buildFarms,4 = buildBarracks

	public faction(boolean isPlayerBool) {
		//Gives starting values
		this.decisionMade = 0;
		this.numOfUnits = 0;
		this.gold = 300;
		this.manpower = 150;
		this.income = 10;
		this.manpowerIncome = 25;
		this.isPlayer = isPlayerBool;
	}

	// Goes through and builds a few markets/barracks/farms at the start to get
	// it all going

	public void start() {

	}

	public void decision() {
		
		//choosing what to buy
		switch (decisionMade) {
		case 0:
			if (this.income < 4 && this.manpowerIncome < 40) {
				buildFarms(); // Build farms if not enough money and men
				this.decisionMade = 3;
			} else if (this.manpowerIncome < 80) {
				buildBarracks(); // Build barracks if not enough men
				this.decisionMade = 4;
			} else if (this.income < 8) {
				buildMarkets(); // Build markets if not making enough money
				this.decisionMade = 2;
			} else {
				this.decisionMade = 1;
			}
			break;
		case 1:
			// build units
			this.decisionMade = 0;
			break;
		case 2:
			// build Markets if enough money
			if (this.marketStats.getPrice() < this.gold) {
				this.gold -= this.marketStats.getPrice();
				this.decisionMade = 0;
			}
			break;
		case 3:
			// build farms if enough money
			if (this.farmStats.getPrice() < this.gold) {
				this.gold -= this.farmStats.getPrice();
				this.decisionMade = 0;
			}
			break;
		case 4:
			// build Markets if enough money
			if (this.barrackStats.getPrice() < this.gold) {
				this.gold -= this.barrackStats.getPrice();
				this.decisionMade = 0;
			}
			break;
		}
	}

	public void endTurn() {
		this.gold += this.income;
		this.manpower += this.manpowerIncome;
	}

	private static void buildMarkets() {

	}

	private static void buildFarms() {

	}

	private static void buildBarracks() {

	}

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
