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

public class sketch_160613c extends PApplet {

// episode #18
// things that happen sometimes

float x = 0;

public void setup() {
  
  background(0);
  stroke(255);
}

public void draw() {
  line(x,200,x,100);
  x = x +1;
  
  if(x > width) {
    x = 0;
  }
  
  // random change line color
  
  // pick a number between 0 and 100
  if (random(100) > 50) {
  // change line color to black
    stroke(0);
  // otherwise change line color to white
  } else {
    stroke(255);
  }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160613c" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
