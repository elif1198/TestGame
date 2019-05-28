import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import static org.lwjgl.opengl.GL11.*;
import static helper.Artist.*;

public class project {

	public project(){
		
		BeginSession();
		
		Texture t = LoadTexture("res/dirt.png","PNG");
		Texture t2 = LoadTexture("res/grass.png","PNG");
		
		while(!Display.isCloseRequested()) {
	   DrawQuadTex(t,0,0,64,64);
	   DrawQuadTex(t2,64,0,64,64);
		
			
			Display.update();
			Display.sync(60);
			
		}
		Display.destroy();
	}
	public static void main(String[] args) {

		new project();
	}

}
