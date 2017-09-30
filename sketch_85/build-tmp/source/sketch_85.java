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

public class sketch_85 extends PApplet {

// #85 

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
	d = 20;
}
  public void settings() { 	size(500, 500); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_85" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
