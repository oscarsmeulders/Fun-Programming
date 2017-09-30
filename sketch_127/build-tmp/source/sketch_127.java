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

public class sketch_127 extends PApplet {

// fun programming #127
// fun with filters

public void setup() {
  
  background(0);
  stroke(255);
  fill(255);
  textSize(80);
}
public void draw() {
  fill(random(255), random(255), random(255));
  ellipse(random(width), random(height), 40, 40);
	filter(BLUR, 2);
//	filter(INVERT);
//	filter (POSTERIZE,2);
//	filter (ERODE);
//	filter (DILATE);
}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_127" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
