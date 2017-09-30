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

public class sketch_160613b extends PApplet {

// episode #17
// a better way to generate random colors

public void setup() {
  
  background(0xff04b1CE);
  noFill();
  colorMode(HSB);
}

public void draw() {

  strokeWeight(random(20,10));

  stroke(random(255),100,255); // Uses HSB not RGB
  
  float rainbowSize = random(200,270);
  
  ellipse(150,350,rainbowSize,rainbowSize);
}
  public void settings() {  size(300,300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160613b" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
