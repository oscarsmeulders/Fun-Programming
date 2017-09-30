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

public class sketch_92 extends PApplet {

// fun programming #92
// interactivity a draggable circle 

int x =100;
int y = 100;
int sz = 100;
int bgcolor;

public void setup() {
	
	colorMode(HSB);
	noStroke();
	

	fill(random(255), 100, 200);
	bgcolor = color (random(255), 150, 255);
	background(bgcolor);
}

public void draw() {
	background(bgcolor);
	ellipse(x, y, sz, sz);

if(dist(x,y,mouseX,mouseY)< sz/2) {
	cursor(HAND);
	if(mousePressed) {
		x = mouseX;
		y = mouseY;
		strokeWeight(5);
	} else {
		strokeWeight(2);
	}
	stroke(255);
	} else {
		cursor(ARROW);
		noStroke();
	}
}




  public void settings() { 	size(400, 300); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_92" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
