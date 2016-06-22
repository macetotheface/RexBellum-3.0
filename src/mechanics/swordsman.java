package mechanics;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class swordsman extends unit {
	public swordsman() throws SlickException{
		this.setBaseRange(1);
		this.setBaseHealth(150);
		this.setBaseAttack(20);
		this.setBaseMoves(2);
		this.setCurrentAttack(this.getBaseAttack());
		this.setSheet(new SpriteSheet("/res/knight.png", 16,16));
	}
}
