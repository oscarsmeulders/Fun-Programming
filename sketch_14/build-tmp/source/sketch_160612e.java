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

public class sketch_160612e extends PApplet {

// fun programming #14
// new directions for moving our circle

float circle_x = 300;
float circle_y = 20;

public void setup() {
  
  stroke(0xffD60DFF);
  strokeWeight(7);
}

public void draw() {
  background(0xff21EA73);
  ellipse(circle_x,circle_y,40,40);
  circle_x = circle_x - 2; 
  circle_y = circle_y + 2; 
}
  public void settings() {  size(400,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160612e" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
