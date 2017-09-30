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

public class sketch_82 extends PApplet {

// episode 82 fun programming
// program a gradient of colors

int c1;
int c2;




public void setup() {
	
	colorMode(HSB,100);	

//	c1 = color (random(75), 20 ,100); // random color select

	c1 = color(200,100,100); // first color
	c2 = color(200,100,30); // second color

	for(int y = 0; y < height; y++) {
		float n = map(y, 0, height, 0, 1);
		int newc = lerpColor(c1, c2, n);
		stroke(newc);
		line(0, y, width, y);
	}
}


  public void settings() { 	size(250,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_82" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
