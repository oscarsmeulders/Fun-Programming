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

public class sketch_91 extends PApplet {

// fun programming #91
// timelines tell a story

public void setup() {
	
	background(0xff2D77EA);
}

public void scene1() {
	ellipse(random(width), random(height), 100, 100);
}

public void scene2() {
	rect(random(width), random(height), 100, 100);
}

public void scene3() {
	float x = random(width);
	line(x, 0, x, height);
}

public void draw() {
	background(0xff2D77EA);
	int m = millis();
	println(m);

	if(m < 2000) {
		scene1();
	} else if (m < 12000) {
		scene2();
	} else if (m < 17000) {
		scene3();
	} else {
		noLoop();
	}
}
  public void settings() { 	size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_91" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
