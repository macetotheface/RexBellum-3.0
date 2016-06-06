package mechanics;
//unfinished
public class archer extends unit {
public archer(int faction){
	this.setBaseRange(2);
	this.setBaseHealth(100);
	this.setBaseAttack(5);
	this.setBaseMoves(2);
	this.setCurrentAttack(this.getBaseAttack());
	
}
}
