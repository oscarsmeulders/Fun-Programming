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

public class sketch_140 extends PApplet {


// fun programming #140
// recursive programming

public void setup() {
	
	background(0xff1D2B53);
	noStroke();
	recursiveThing(width/2, height/2, 400);
}

public void recursiveThing(float x, float y, float sz) {
	// sz size
	float a, nx, ny;
	fill(lerpColor (0xffFF004D, 0xffFFF024, random(1)));
	ellipse(x, y, sz, sz);
	if(sz > 12) {

		a = random(HALF_PI);
		nx = x + sz/2 + sin(a);
		ny = y + sz/2 + cos(a);
		recursiveThing(nx, ny, sz/2);

		a = random(HALF_PI);
		nx = x + sz/2 * sin(a);
		ny = y + sz/2 * cos(a);
		recursiveThing(nx, ny, sz/2);

		a = random(TWO_PI);
		nx = x + sz/2 * sin(a);
		ny = y + sz/2 * cos(a);
		recursiveThing(nx, ny, sz/2);
	}
}

  public void settings() { 	size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_140" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
