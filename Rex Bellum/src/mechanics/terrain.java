package mechanics;

public class terrain {
	private int terrainType; //1 - Grasslands, 2 - hills, 3 - mountains, 4 - forests, 5 - river
	private double defenderMod;
	private double archerMod;
	private int bonusMarket;
	private int bonusFarm;
	private int bonusBarracks;
	private boolean passable;
	
	terrain(int type){
		this.terrainType = type;
		switch(terrainType){
			case 1:
				//Grasslands
				this.defenderMod = 1;
				this.archerMod = 1;
				this.passable = true;
				this.bonusMarket = 0;
				this.bonusFarm = 2;
				this.bonusBarracks = 0;
				break;
			case 2:
				//hills
				this.defenderMod = 2;
				this.archerMod = 1.5;
				this.passable = true;
				this.bonusMarket = 0;
				this.bonusFarm = 0;
				this.bonusBarracks = 0;
				break;
			case 3:
				//mountains
				this.defenderMod = 5;
				this.archerMod = 2;
				this.passable = false;
				this.bonusMarket = 0;
				this.bonusFarm = 0;
				this.bonusBarracks = 0;
				break;
			case 4:
				//forests
				this.defenderMod = 1.25;
				this.archerMod = 0.75;
				this.passable = true;
				this.bonusMarket = 0;
				this.bonusBarracks = 2;
				this.bonusFarm = 0;
				break;
			case 5:
				//rivers
				this.defenderMod = 2;
				this.archerMod = 1;
				this.passable = true;
				this.bonusMarket = 2;
				this.bonusFarm = 0;
				this.bonusBarracks = 0;
				break;
		}
	}

	/**
	 * @return the terrainType
	 */
	public int getTerrainType() {
		return terrainType;
	}

	/**
	 * @param terrainType the terrainType to set
	 */
	public void setTerrainType(int terrainType) {
		this.terrainType = terrainType;
	}

	/**
	 * @return the defenderMod
	 */
	public double getDefenderMod() {
		return defenderMod;
	}

	/**
	 * @param defenderMod the defenderMod to set
	 */
	public void setDefenderMod(double defenderMod) {
		this.defenderMod = defenderMod;
	}

	/**
	 * @return the archerMod
	 */
	public double getArcherMod() {
		return archerMod;
	}

	/**
	 * @param archerMod the archerMod to set
	 */
	public void setArcherMod(double archerMod) {
		this.archerMod = archerMod;
	}

	/**
	 * @return the bonusMarket
	 */
	public int getBonusMarket() {
		return bonusMarket;
	}

	/**
	 * @param bonusMarket the bonusMarket to set
	 */
	public void setBonusMarket(int bonusMarket) {
		this.bonusMarket = bonusMarket;
	}

	/**
	 * @return the passable
	 */
	public boolean isPassable() {
		return passable;
	}

	/**
	 * @param passable the passable to set
	 */
	public void setPassable(boolean passable) {
		this.passable = passable;
	}
}
