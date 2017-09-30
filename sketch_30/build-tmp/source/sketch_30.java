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

public class sketch_30 extends PApplet {

// fun programming 30
// multiple rotating objects and reset matrix


float r = 0;

public void setup() {
  
  noStroke();
  fill(0);
  rectMode(CENTER);
}

public void draw() {
  
  background(255);
  translate(100,100);
  rotate(r);
  rect(0,0,80,80);
  resetMatrix();
  
  
  translate(300,100);
  rotate(r);
  rect(0,0,80,80);
  resetMatrix();
  
  translate(300,300);
  rotate(r);
  rect(0,0,80,80);
  resetMatrix();
  
  translate(100,300);
  rotate(r);
  rect(0,0,80,80);
  resetMatrix();
  

  
  r = r + 0.02f;
  
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_30" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
