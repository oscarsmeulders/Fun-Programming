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

public class sketch_71 extends PApplet {

// episode #71 fun programming
// playing with directions

float oldx; // last x position
float oldy; // last y position
float a; // angle
float w; // width

public void reset() {
	oldx = width/2; // resets to center
	oldy = height/2;
	a = random(TWO_PI); // converts
	stroke(255);
	w = 1; // reset width to 1
}

public void setup() {
	
	background(0xff222222);
	colorMode(HSB,100);
	
	noFill();
	reset();
}

public void draw() {
	stroke(20,80,noise(w,a)*100); // set stroke color
	strokeWeight(w);
	float newx = oldx + cos(a) * 8;
	float newy = oldy + sin(a) * 8;
	line(oldx, oldy, newx, newy);
	oldx = newx;
	oldy = newy;

	a = a + random(-0.8f, 0.8f); // randomly changes angle
	w = w + 0.4f; // 

	if(oldx < 0 || oldy < 0 || oldx > width || oldy > height) {
		reset();
	} 
}
  public void settings() { 	size(500, 400); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_71" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
