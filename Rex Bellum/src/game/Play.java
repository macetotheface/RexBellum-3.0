package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.tiled.TiledMap;

public class Play extends BasicGameState{
	private TiledMap map;
	
	public Play(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{	
		map = new TiledMap("res/map.tmx");
	
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		map.render(40, 0);
	
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException{
	}
	public int getID() {
		return 1;
	}
}
