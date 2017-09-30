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

public class sketch_65 extends PApplet {

// episode 65 fun programming
// are we getting close use dist() to find out the distance

float x = 0;
float y = 0;
float d = 0;

float destx = 0;
float desty = 0;

public void setup() {
  
  fill(255, 0, 0);
  noStroke();
  destx = random(width);
  desty = random(height);
}
public void draw() {
  background(255);
  ellipse(x, y, 20, 20);

  // lerp function can find out what's the middle point between two other points
  x = lerp(x, destx, 0.1f);
  y = lerp(y, desty, 0.1f);

  float d = dist(x, y, destx, desty);

  if (d < 1) {

    destx = random(width);
    desty = random(height);

    if (d < 50) {
      noFill();
      stroke(255, 0, 0);
      ellipse(x, y, 100-d, 100-d);
      noFill();
      stroke(255, 0, 0);
    }
  }


  println(d);
}
  public void settings() {  size(500, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_65" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
