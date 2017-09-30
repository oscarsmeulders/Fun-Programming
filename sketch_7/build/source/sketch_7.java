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

public class sketch_7 extends PApplet {

// fun programming episode #7
// animate horizontal lines using a variable

// animation
// white lines on black background
// the lines begin on the left border and end on the right border
// lines must be horizontal

public void draw() {
  background(0);
  stroke(255);

  float distance_top = random(100);

  line(0,distance_top,99,distance_top);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_7" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
