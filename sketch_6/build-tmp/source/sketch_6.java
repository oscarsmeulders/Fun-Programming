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

public class sketch_6 extends PApplet {

// fun programming episode #6
// animate white lines across the display

// animation
// white lines on black background
// the lines begin on the left border and end on the right border

public void draw() {
  background(0);
  stroke(255);
  line(0,random(100),99,random(100));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
