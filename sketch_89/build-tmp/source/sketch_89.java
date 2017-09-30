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

public class sketch_89 extends PApplet {

// fun programming #89
// create your own photo filters

public void setup() {
	
	PImage img = loadImage("big_image.jpg");
	image(img,0,0);

	loadPixels();
	for(int i = 0; i < pixels.length; i++) {

		float r = red(pixels[i]);
		float g = 0; // removes green
		float b = blue(pixels[i]);


		pixels[i] = color(r,b,b + 0.8f);
		// pixels[i] = color(r,g,b);
	}
	updatePixels();
}

public void draw() {

}
  public void settings() { 	size(500,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_89" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
