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

public class sketch_4 extends PApplet {

// fun programming episode #4
// shades of gray and colors, frameRate()

public void setup() {
  frameRate(12);
}

public void draw() {
  background(random(256),random(256),random(256));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
