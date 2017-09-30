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

public class sketch_77 extends PApplet {


// fun programming episode #76
// a 3d rotating cloud of points

int amount = 800;
int [] x = new int [amount];
int [] y = new int [amount];
int [] z = new int [amount];

public void setup() {
	
	background(0);
	noFill();
	stroke(255);
	strokeWeight(1);

	for (int i = 0; i < 100; i++) {
		x[i] = PApplet.parseInt (random(-150,150));
		y[i] = PApplet.parseInt (random(-150,150));
		z[i] = PApplet.parseInt (random(-150,150));
	}
}

public void draw() {
//	background(0);
	translate(width/2, height/2);
	rotateY(frameCount/100.0f);
	// box(300);

	for(int i = 0; i < amount; i++) {
		point(x[i], y[i], z[i]);
	}

}
  public void settings() { 	size(300, 300, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_77" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
