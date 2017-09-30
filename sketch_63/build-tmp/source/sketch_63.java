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

public class sketch_63 extends PApplet {


// episode #63 fun programming
// time for our first 3d animation

float a = 0; // box parameters translate
float r = 0; // rotate

public void setup() {
  
  noCursor();
}

public void draw() {
  background(80);
  translate(mouseX, mouseY, map(noise(a), 0, 1, 200, 200));
  rotateY(r);
  box(50);
  
  a = a + 0.01f;
  r = r + 0.1f;
  
}
  public void settings() {  size(400, 400, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_63" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
