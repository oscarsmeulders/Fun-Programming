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

public class sketch_64 extends PApplet {

// episode 64 fun programming
// animate objects that slow down and stop using lerp()

float x = 0;
float y = 0;

public void setup() {
  
  fill(255, 0, 0);
  noStroke();
}
public void draw() {
  background(255);
  ellipse(x, y, 20, 20);
  
  // lerp function can find out what's the middle point between two other points
  x = lerp(x, mouseX, 0.05f);
  y = lerp(y, mouseY, 0.05f);
}
  public void settings() {  size(500, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_64" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
