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

public class sketch_72 extends PApplet {

// episode #72 fun programming
// create visual rhythms using modulo

int n = 0;

public void setup() {
	
	background(255);
	frameRate(2);
	noStroke();
	fill(50, 200, 50);
}

public void draw() {
	background(255);
	print(n % 7);

	if (n % 7 == 0) {
		rect(20, 0, 100, 100);
	}

	if (n % 7 == 1) {
		rect(100, 0, 100, 100);
	}	 

	if (n % 7 == 2) {
		rect(200, 0, 100, 100);
	}



	n = n +1;	
}
  public void settings() { 	size(400, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_72" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
