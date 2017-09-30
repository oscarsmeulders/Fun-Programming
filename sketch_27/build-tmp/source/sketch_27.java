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

public class sketch_27 extends PApplet {

// fun programming #27
// animating while rotating

float r =0;

public void setup() {
  
  background(10);
  
  noStroke();
}

public void draw() {
  fill(255);
  rotate(r); // rotation of screen is 0.2
  
  float circleSize = random(5,15);
  
  ellipse(20 + r,10,circleSize,circleSize);
  r = r + 0.1f;
  println(r);
  }
  public void settings() {  size(400,400);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_27" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
