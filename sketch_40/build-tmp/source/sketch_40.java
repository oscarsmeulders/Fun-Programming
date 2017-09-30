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

public class sketch_40 extends PApplet {


// episode #40 fun programming
// the candy-space understanding noise() with 2 and 3 parameters

float z = 0;

public void setup() {
  
  noStroke();
  colorMode(HSB); // hue saturation brightness
  background(0);
}

public void draw() {

  if (mousePressed == true) {
    point(mouseX,mouseY);
 }

  float x = 0;
  while (x < width) {
    float y = 0;
    while (y < height) {
      float co = 255 * noise(x/500, y/500, z);
      fill(co, 255, 255);
      ellipse(20 + x, 20 + y, 60, 60);
      y = y + 40;
    }
    x = x + 40;
  }
  z = z + 0.01f;
}

public void keyPressed() {
  println("drawing saved");
  save("my_drawing.png");
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_40" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
