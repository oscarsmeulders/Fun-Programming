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

public class sketch_5 extends PApplet {

// fun programming episode #5
// light speed effect, change line colors

public void setup() {
  // set up is only called once
  background(0);
}

public void draw() {
  // draw runs over and over again
  // screen is 100px wide and 100px tall
  stroke(0,random(255),0);
  // draw random lines from the center
  line(50,50,random(100),random(100));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
