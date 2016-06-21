package game;

import org.lwjgl.*;
import org.lwjgl.input.Mouse;
import mechanics.*;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.tiled.*;

public class Play extends BasicGameState{
	private Animation archerani;
	//private boolean mousePressed;
	private Input input;
	private int xpos = 50;
	private int ypos = 0;
	private int tileID;
	//private Image holder;
	private TiledMap map;
	//private boolean quit = false;
	//private int[] duration = {200,200};
	//private float positionX = 0;
	//private float positionY = 0;
	
	public Play(int state) throws SlickException{
		//
	}
	public String mouse = "no input yet";
	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{	
		archer hi = new archer();
		archerani = new Animation(hi.getSheet(), 250);
		map = new TiledMap("res/map.tmx");
		
		
		//holder = new Image("res/placeholder.png");
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.scale(1f, 1f);
		//g.scale(Display.getWidth()/720, Display.getHeight()/600);
		map.render(0,0,0,-3,720,600);
		//holder.draw(100,100,32,32);
		//g.draw()
		g.drawString(mouse, 50, 50);
		g.drawRect(560, 0, 158, 47);
		g.drawRect(560, 48, 158, 551);
		g.drawRect(0, 0, 559, 47);
		g.drawRect(560, 48, 158, 100);
		g.drawRect(560, 149, 158, 25);
		g.drawRect(560, 174, 75, 75);
		g.drawRect(560, 174, 158, 250);
		archerani.draw(200,200);
	
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException{
		input = gc.getInput();
		//mousePressed = false;
		xpos = Mouse.getX();
		ypos = Mouse.getY();
		mouse = "Mouse position x:" + xpos + "y" + ypos; 
		//if(input.isMouseButtonDown(Input.MOUSE_LEFT_BUTTON)) {
	     //    mousePressed = true;
	     // }
		if(input.isMousePressed(0)) {
			tileID = map.getTileId(xpos,ypos,0);
			System.out.println(tileID);
		}
	}
	
	public int getID() {
		return 1;
	}
}
