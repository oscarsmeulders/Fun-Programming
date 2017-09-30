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

public class sketch_67 extends PApplet {

// episode 67 fun programming
// circular motion sine and her cousin

float a = 0;
float b = 0;
float co = 0;

public void setup() {
  background(0xff111111);
  colorMode(HSB, 100);
  
  
  strokeWeight(4);
}

public void draw() {

  stroke(co, 100, 100, 120);

  float x0 = map(sin(a), -1, 1, 40, width -80);
  float y0 = map(cos(a), -1, 1, 40, height -80);

  float x1 = map(sin(b), -1, 1, 40, width -80);
  float y1 = map(cos(b), -1, 1, 40, height -80);

  // background();
  // stroke(0);
  // point(x0,y0);
  // point(x1,y1);

  line(x0, y0, x1, y1);

  // --- sketch 1 -- //
  //  a = a + 0.02;
  //  b = b + 0.9;

  // --- sketch 2 -- //
  a = a + 0.04f;
  b = b + 0.8f;


  co = co +1;
  if (co > 200) {
    co = 0;
  }
}
  public void settings() {  size(500, 500);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_67" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
