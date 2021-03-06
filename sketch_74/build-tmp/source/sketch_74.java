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

public class sketch_74 extends PApplet {

// sketch #74 fun programming
// for loops and other ways of typing less

int csize = 50;
int grow = 1;
int n = 0;

public void setup() {
	
	noStroke();
	
	fill(255, 0, 0);	
}

public void draw() {
	background(255);

	if (n % 20 == 0) {
		grow = 5;
	}

	if (csize > 60) {
		csize = 60;
		grow  = -2;
	}

	if (csize < 50) {
		csize = 50;
		grow = 0;
	}


	ellipse(200, 200, csize, csize);

	csize = csize + grow;

	n ++ ;
//	n = n +1;
	println("frameCount is " + frameCount);

}
  public void settings() { 	size(400, 400); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_74" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
