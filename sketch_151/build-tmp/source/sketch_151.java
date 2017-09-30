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

public class sketch_151 extends PApplet {

// episode #150
// convert an image into a 3D grid of boxes

PImage img;

public void setup() {
	
	img = loadImage("moon.jpg");
	img.loadPixels();
	noStroke();
}

public void draw() {
	background(255);
	lights();
	translate(width/2, height/2);
	scale(5);
	rotateX(mouseY * 0.01f);
	rotateY(mouseX * 0.01f);
//	image(img, 0, 0);

for(int x = 0; x < 100; x++){

	for(int y = 0; y < 100; y++) {

	// read color from width of image
	int imgx = (int)map(x, 0, 100, 0, img.width);
	// read color from width of image
	int imgy = (int)map(y, 0, 100, 0, img.width);
	// gets brightness from image
	float bri = brightness(img.get(imgx, imgy));
	if(bri > 50) {
	// draw boxes
	pushMatrix();
	translate(x, y);
	box(bri/100.0f);
	popMatrix();
			}
		}
	}
}
  public void settings() { 	size(600, 400, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_151" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
