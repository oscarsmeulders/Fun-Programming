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

public class sketch_88 extends PApplet {

// episode 88 fun programming
// change pixels using the pixels array

public void setup() {
	
}

public void draw() {

loadPixels();
	pixels[123456] = color(255,0,0);
	for(int i =0; i < pixels.length; i++) {
		pixels[i] = color(random(255));
	}
updatePixels();
}
  public void settings() { 	size(500,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_88" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
