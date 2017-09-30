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

public class sketch_114 extends PApplet {

// fun programming #114
// how to create movies using processing

// c is color
int c = 255;

public void setup() {
	
	background(0);
	frameRate(25);
}

public void draw() {
	noStroke();
	fill(c, random(100));
	rectMode(CENTER);

	float sz = random(200);

	rect(random(width), random(height),sz, sz);

	// every 200 frame condition will be true
	if(frameCount % 200 ==0) {
		// every 200 frames swaps color (c)
		c = 255 - c;
	}
	saveFrame("frame-####.tif");
	// program will render 1000 frames then stop
	if (frameCount > 200) { // 1000 / frameRate(25) = 40 secons
		noLoop();
	}
}
  public void settings() { 	size(640, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_114" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
