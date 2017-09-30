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

public class sketch_12 extends PApplet {

// fun programming #12
// do a loop animation using an if() statement

float slow_circle_x = 0;
float fast_circle_x = 0;

public void setup() {
  
  noStroke();
  
}

public void draw() {
  background(0xff1881F5);

  fill(0xffC1FF3E);
  ellipse(slow_circle_x,50,50,50);
  slow_circle_x = slow_circle_x +1;
  
  fill(0xffDB3CB6);
  ellipse(fast_circle_x,50,50,50);
  fast_circle_x = fast_circle_x +5;
 
 // when slow_circle_x reaches the edge 400 go back to 0
  if (slow_circle_x > 400) {
    slow_circle_x = 0;
  }

 // when fast_circle_x reaches the edge 400 go back to 0
  if (fast_circle_x > 400) {
    fast_circle_x = 0;
  }

   
   
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_12" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
