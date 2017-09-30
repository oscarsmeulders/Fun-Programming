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

public class sketch_96 extends PApplet {

// episode #96
// Easier mouse in a rectangle

int x1 = 100;
int y1 = 50;
int x2 = 300;
int y2 = 100;

int bgcolor;
int fgcolor;

public void newcolor() {
  float h = random(100);
  bgcolor = color(h, 50, 30);
  fgcolor = color(h, 80, 100);
  fill(fgcolor);
  noStroke();
}

public void setup() {
  
  colorMode(HSB, 100);
  rectMode(CORNERS);
  newcolor();
}
public boolean inside() {
  return mouseX > x1 && mouseX < x2 && mouseY > y1 && mouseY < y2;
}
public void draw() {
  background(bgcolor);
  
  if(inside() && mousePressed) {
    newcolor();
  }
  
  rect(x1, y1, x2, y2);
}
  public void settings() {  size(400, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_96" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
