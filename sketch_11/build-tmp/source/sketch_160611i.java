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

public class sketch_160611i extends PApplet {

// fun programming #11
// non-random animation of a circle crossing the screen

float circle_x = 0;

public void setup() {
  
  background(0xffC1FF3E);
  noStroke();
  fill(0xffffffff);
}

public void draw() {
  background(0xffC1FF3E);
//  ellipse(circle_x,50,random(80),random(80));
  ellipse(circle_x,50,50,50);
  circle_x = circle_x +1;
}
  public void settings() {  size (400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160611i" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
