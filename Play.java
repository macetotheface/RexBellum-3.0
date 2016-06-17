package game;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.tiled.TiledMap;

public class Play extends BasicGameState{
	
	private Image holder;
	private TiledMap map;
	//private boolean quit = false;
	//private int[] duration = {200,200};
	//private float positionX = 0;
	//private float positionY = 0;
	
	public Play(int state){
		
	}
	public String mouse = "no input yet";
	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{	
		
		map = new TiledMap("res/map.tmx");
		holder = new Image("res/placeholder.png");
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.scale(1f, 1f);
		//g.scale(Display.getWidth()/720, Display.getHeight()/600);
		map.render(0,0,0,-3,720,600);
		//gc.setFullscreen(true);
		holder.draw(100,100,32,32);
		g.drawString(mouse, 50, 50);
		g.drawRect(560, 0, 158, 47);
		g.drawRect(560, 48, 158, 551);
		g.drawRect(0, 0, 559, 47);
		g.drawRect(560, 48, 158, 100);
		g.drawRect(560, 149, 158, 25);
		g.drawRect(560, 174, 75, 75);
		g.drawRect(560, 174, 158, 250);
	
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mouse = "Mouse position x:" + xpos + "y" + ypos; 
	}
	
	public int getID() {
		return 1;
	}
}
