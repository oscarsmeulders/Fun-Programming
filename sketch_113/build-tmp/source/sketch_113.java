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

public class sketch_113 extends PApplet {

// fun programming episode #113
// array of objects: hypnotic animation part II

Bug[] orecuho = new Bug[200];

public void setup() {
  
  
  noStroke();
  fill(35);
  for(int i=0; i<orecuho.length; i++) {
    float x = width/2 + cos(i/2.8f) * i;
    float y = height/2 + sin(i/2.8f) * i;
    orecuho[i] = new Bug(x, y, 0.20f - (i/1200.0f) );
  }
}
public void draw() {
  background(0, 150, 150);
  
  for(int i=0; i<orecuho.length; i++) {
    orecuho[i].live();
  }
}
class Bug {
  float x;
  float y;
  
  float t;
  float speed;
   
  Bug(float tx, float ty, float tspeed) {
    x = tx;
    y = ty;
    t = 0;
    speed = tspeed;
  }

  public void live() {
    float sz = map(sin(t), -1, 1, 10, 20);
    ellipse(x, y, sz, sz);
    t = t + speed;
  }  
}	
  public void settings() {  size(400, 400);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_113" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
