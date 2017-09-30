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

public class sketch_98 extends PApplet {

// episode #98 fin programming
// interarcing with many rectangles part two

int amt = 50;

int[] x1 = new int [amt];
int[] x2 = new int [amt];
int[] y1 = new int [amt];
int[] y2 = new int [amt];

int [] c = new int[amt];

int bgcolor;

public void setup() {
	
	colorMode(HSB,100);
	rectMode(CORNERS);
	noStroke();	

	bgcolor = color(random(100), 30 ,30);


	for(int i = 0; i < amt; i++) {
		x1[i] = PApplet.parseInt (random(width));
		x2[i] = x1[i] + PApplet.parseInt (random(20, 100));
		y1[i] = PApplet.parseInt (random(height));
		y2[i] = y1[i] + PApplet.parseInt (random(20, 100));
		c[i] = color(random(100), 80, 80);
	}
}

public void draw() {
	background(bgcolor);


	int found = -1;
	for(int i = 0; i < amt; i++) {
		fill(c[i]);
		rect (x1[i], y1[i], x2[i], y2[i]);

		if(mouseX > x1[i] && mouseX < x2[i] && mouseY > y1[i] && mouseY < y2[i]) {
			found = i;
		}
	}
	if(found >= 0) {

		if(mousePressed) {
			x1[found] = PApplet.parseInt (random(width));
			x2[found] = x1[found] + PApplet.parseInt (random(20, 100));
			y1[found] = PApplet.parseInt (random(height));
			y2[found] = y1[found] + PApplet.parseInt (random(20, 100));

		} else {

		}

		noFill();
		stroke(100);
		rect(x1[found], y1[found], x2[found], y2[found]);
		noStroke();
	}
}







  public void settings() { 	size(400, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_98" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
