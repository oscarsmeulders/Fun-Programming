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

public class sketch_128 extends PApplet {

// fun programming #128
// fun with filters part two animated blobs

public void setup() {
  
  background(0);
  stroke(255);
  fill(255);
  textSize(80);
}

public void draw() {


	// fills with white
	if(mousePressed) {

//		short hand if statements
//		fill(keyPressed ? 255 : 0);		
		
		if(keyPressed) {
			fill(0);

		// shift click to fill with black
		} else {
			fill(255);
		}


		// chooses char between 65 & 90 converts to a int asigns mouse positions
		text(PApplet.parseChar(PApplet.parseInt(random(65,90))), mouseX-30, mouseY+40);
	}
	  filter(BLUR, 2);
	  filter(THRESHOLD);
}
  public void settings() {  size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_128" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
