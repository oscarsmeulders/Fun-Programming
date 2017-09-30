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

public class sketch_90 extends PApplet {

// fun programming #90
// change pixel hue, saturation and brightness

public void setup() {
	
	colorMode(HSB);

	PImage img = loadImage("big.png");
	image(img, 0, 0);

// place code block into draw
	loadPixels();
	for(int i=0; i < pixels.length; i++) {
		float b = brightness(pixels[i]);
		float s = saturation(pixels[i]);
		float h = hue(pixels[i]);
		pixels[i] = color(255 - h,s + 20, b + 78);
	}
	updatePixels();
// --------- //

}

public void draw() {

}
  public void settings() { 	size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_90" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
