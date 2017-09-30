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

public class sketch_61 extends PApplet {


// episode #61 fun programming
// draw shaky points append items to an array

float x[] = {};
float y[] = {};


public void setup() {
  
  background(255);
  noStroke();
}

public void draw() {
  background(255);
  int i = 0; // start at 0
  while (i < x.length) {
    if (random(20) > 17) {
      fill(255, 0, 0);
    } else {
      fill(40);
    }
    ellipse(x[i], y[i], 20, 20);
    y[i] = y[i] + random(-2, 2);
    x[i] = x[i] + random(-2, 2);
    i = i + 1;
  }
}

public void mousePressed() {

  x = append(x, mouseX);
  y = append(y, mouseY);

  //  println(x.length);
}
  public void settings() {  size(500, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_61" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
