import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_81 extends PApplet {

// episode 81 fun programming
// how to read the color pixels

public void setup() {
	

	for (int x =0; x < width; x++) {
		for(int y =0; y < 120; y++) {
			
			float r = map(noise(x / 80.0f, y/80.0f, 10.0f), 0, 1, 0, 255);
			float g = map(noise(x / 80.0f, y/80.0f, 20.0f), 0, 2, 0, 255);
			float b = map(noise(x / 80.0f, y/80.0f, 30.0f), 0, 1, 0, 255);

			stroke(r,g,b);
			point(x,y);
		}
	}
}

public void draw() {
	int color_under_mouse = get(mouseX, mouseY);
	fill(color_under_mouse);
	noStroke();
	rect(0,120,width,280);
}
  public void settings() { 	size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_81" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
