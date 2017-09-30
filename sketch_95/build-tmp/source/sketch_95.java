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

public class sketch_95 extends PApplet {

// fun programming #94
// is the circle inside the square 

float x =100;
float y = 100;
float sz = 100;
int bgcolor;

float current_weight = 2;
float target_weight = 2;

float current_alpha =0;
float target_alpha = 0;

public void setup() {
	
	colorMode(HSB);
	noStroke();
	
//	rectMode(CENTER);

	fill(random(255), 100, 200);
  	bgcolor = color(random(255), 150, 255);
  	background(bgcolor);
}

public void draw() {
	background(bgcolor);

	if(mouseX > x-sz/2 && mouseX < x+sz/2 && mouseY > y-sz/2 && mouseY < y+sz/2) {
		if(mousePressed) {
		cursor(MOVE);
		x = lerp(x, mouseX, 0.2f);
		y = lerp(y, mouseY, 0.2f);
		target_weight = 10;
	} else {
		cursor(HAND);
		target_weight = 5;
		}
		target_alpha = 255;
	} else {
		cursor(ARROW);
		target_alpha = 0;
}
	current_weight = lerp(current_weight, target_weight, 0.2f);
	strokeWeight(current_weight);

	current_alpha = lerp(current_alpha, target_alpha, 0.2f);
	stroke(255, current_alpha);
	rect(x, y, sz, sz);
}




  public void settings() { 	size(400, 300); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_95" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
