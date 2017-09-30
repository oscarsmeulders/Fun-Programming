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

public class sketch_112 extends PApplet {

// fun programming episode #112
// array of objects: hypnotic animation part I

Bug orechuo;

public void setup() {
	
	
	noStroke();
	fill(255);
	orechuo = new Bug(100,100,15);	
}

public void draw() {
	background(150, 0, 0);	

	orechuo.live();
}
// bug



class Bug {
	float x;
	float y;
	float sz; // size

	float maxsz; // max size
	float minsz; // min size
	float grow;

	Bug(float tx, float ty, float tsz) {
		x = tx;
		y = ty;
		sz = tsz;

		maxsz = 20;
		minsz = 10;
		grow = random(0.2f,0.8f);
	}

public void live() {
	ellipse(x, y, sz, sz);
	sz = sz + grow;

	// grow to max size
	if (sz > maxsz) {
		sz = maxsz;
		grow = -grow;
	}
    
    // grow to minimum size
    if (sz < minsz) {
    	sz = minsz;
    	grow = -grow;
	    }
    }
}
  public void settings() { 	size(400, 400); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_112" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
