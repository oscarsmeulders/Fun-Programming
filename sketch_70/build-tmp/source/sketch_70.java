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

public class sketch_70 extends PApplet {

// fun programming episode #70
// slowly change the direction

float oldx; // last x position
float oldy; // last y position
float a; // angle

public void reset() {
	oldx = width/2;
	oldy = height/2;
	a = random(TWO_PI); // converts
	stroke(random(255), 255, 255);
}

public void setup() {
	
	background(255);
	colorMode(HSB,100);
	
	noFill();
	reset();
}

public void draw() {
	float newx = oldx + cos(a) * 5;
	float newy = oldy + sin(a) * 5;
	line(oldx, oldy, newx, newy);
	oldx = newx;
	oldy = newy;
	a = a + random(-0.4f, 0.4f);
}

  public void settings() { 	size(500, 400); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_70" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
