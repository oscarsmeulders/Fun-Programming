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

public class sketch_83 extends PApplet {

// episode 83 fun programming
// circular gradients can look like spheres

int c1;
int c2;


public void setup() {
	
	colorMode(HSB,100);
	noFill();
	strokeWeight(2);
	background(0);

//	c1 = color (random(75), 20 ,100); // random color select

	c1 = color(random(200),100,100); // first color
	c2 = color(random(100),30); // second color

	float maxr = 300;

	for(int r = 0; r < maxr; r++) {
		float n = map(r, 0, maxr, 0, 1);
		int newc = lerpColor(c1, c2, n);
		stroke(newc);
		ellipse(100, 100, r, r);
	}
}


  public void settings() { 	size(250,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_83" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
