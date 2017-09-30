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

public class sketch_86 extends PApplet {

// fun programming episdoe #86
// drawing shapes with your mouse

float d = 20;
PImage back_image;

public void setup() {
	
	background(0xffFF760D);
	noFill();
	stroke(255);
	strokeWeight(8);
		
	back_image = loadImage("new_back.jpg");
}

public void draw() {
	background(back_image);
//	image(back_image, mouseX, mouseY);
	ellipse(mouseX, mouseY, d, d);

	if(mousePressed) {
		d++;
	}
}

public void mouseReleased() {
	loadPixels();
	back_image.pixels = pixels;

	d = 20;
}









  public void settings() { 	size(500, 500); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_86" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
