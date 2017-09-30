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

public class sketch_148 extends PApplet {


// episode #148 fun programming
// drawing shapes with glow or shadows

public void setup() {
	
	colorMode(HSB);
	rectMode(CENTER);
	frameRate(5);
}

public void draw() {
	background(0);
	for (int i = 0; i < 20; ++i) {
		pushMatrix();
		translate(width/2, height/2);
		rotate(i);
		glowingRect((i % 5) * 20, (i % 4) * 15, 120, 80, 0xff22FF66, 0xff406661, mousePressed);
//		glowingRect((i % 5) * 20, (i % 4) * 15, 10, #22FF66, #FF6622);
		popMatrix();
	}
}

public void glowingRect (float x, float y, float w, float h, int fillColor, int glowColor, boolean effectActive) {


	// if effect Active draws 
	if(effectActive) {

	stroke(glowColor, 10);
	strokeWeight(18);
	rect(x, y, w, h);

	stroke(glowColor, 20);
	strokeWeight(19);
	rect(x, y, w, h);

	stroke(glowColor, 30);
	strokeWeight(20);
	rect(x, y, w, h);

	stroke(glowColor, 40);
	strokeWeight(31);
	rect(x, y, w, h);

}
	noStroke();
	fill(fillColor);
	rect(x, y, w, h);
}
  public void settings() { 	size(675, 675); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_148" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
