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

public class sketch_68 extends PApplet {


// episode #68 fun programming
// circular motion reviewed

float a = 0;

public void setup() {
  
}


public void draw() {
  float r = random(140, 140);
  float x = width /2 + cos(a) * r;
  float y = height /2 + sin(a) * r;
  noStroke();
  ellipse(x, y, 10, 10);
  a = a + 0.1f;
  if (a > TWO_PI) {
    noLoop();
  }
}
  public void settings() {  size(500, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_68" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
