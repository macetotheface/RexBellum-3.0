package mechanics;

public class aiEndTurn {
	
	private faction aiFaction;
	
	
	aiEndTurn(faction xFaction){
		this.aiFaction = xFaction;
		
		if (aiFaction.getIncome() < 8 && aiFaction.getManpowerIncome() < 80){
			buildFarms();
		}
		else if (aiFaction.getManpowerIncome() < 80){
			buildBarracks();
		}
		else if (aiFaction.getIncome() < 8){
			buildMarkets();
		}
	}
	
	private void buildMarkets(){
		
	}
	
	private void buildFarms(){
		
	}
	
	private void buildBarracks(){
		
	}
}
