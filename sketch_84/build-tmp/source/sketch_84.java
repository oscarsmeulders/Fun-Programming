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

public class sketch_84 extends PApplet {

// episode 84 fun programming
// draw gradients, review functions and image loading

PImage back;

public void setup() {
	
	colorMode(HSB,100);
	noFill();
	
	strokeWeight(2);
	background(0);
	back = loadImage("data/image.jpg");
	image(back,0,0);
}

public void draw_circ_grad(int x, int y, int maxd) {
  	int c1 = color(random(100), 100, 100);
  	int c2 = color(random(100), 100, 30);

//	float maxd = 300;

	for(int d = 0; d < maxd; d++) {
		float n = map(d, 0, maxd, 0, 1);
		int newc = lerpColor(c1, c2, n);
		stroke(newc);
		ellipse(x, y, d, d);
	}
}


public void mousePressed() {

	draw_circ_grad(mouseX,mouseY, PApplet.parseInt(random(50,300)));
//	println(mouseX);
//	println(mouseY);
}



public void draw() {

}


  public void settings() { 	size(250,250); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_84" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
