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

public class sketch_122 extends PApplet {

// fun programming #122
// programming roses and other flowers

float k = 2/7.0f;

public void setup() {
  
  background(0xff129575);
  colorMode(HSB);
  strokeWeight(0.01f);
}
public void draw() {
  translate(width/2, height/2);
  scale(200, 200);
  float t = frameCount / 20.0f;
  float x = cos(k*t) * sin(t);
  float y = cos(k*t) * cos(t); 
  stroke(200);
  line(0, 0, x, y);
}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_122" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
