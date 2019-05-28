package helper;

import org.newdawn.slick.opengl.Texture;

public class tile {
	private float x, y, width,height;
	private Texture texture; 
	
	public tile(float x, float y, float width,float height, Texture texture) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

}
