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

public class sketch_16 extends PApplet {

// episode #16
// create an animated rainbow

public void setup() {
  
  background(0xff04b1CE);
  noFill();
}

public void draw() {

  strokeWeight(random(3,10));
  stroke(random(100,255),random(100,255),random(255)); // RGB
  
  float rainbowSize = random(200,270);
  
  ellipse(150,350,rainbowSize,rainbowSize);
}
  public void settings() {  size(300,300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_16" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
