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

public class sketch_76 extends PApplet {


// fun programming episode #75
// bezier curves are so beautiful

public void setup() {
	
	
	noFill();	
}

public void draw() {
	background(255);
	float t = frameCount/1000.0f; // added decimal 
	for(int i =0; i < 30; i++) { // loops from frameCount
	  	bezier(width/2, height,
	  		width/2, noise(1, i, t) * height,
	  		noise(2, i, t) * width, noise(4, i, t) * height,
	  		noise(3, i, t) * width, noise(5, i, t) * height
	  		);	
	}
}
  public void settings() { 	size(500, 400); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_76" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
