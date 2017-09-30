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

public class sketch_24 extends PApplet {

// episode #24
// circle patterns with a while loop

public void setup() {
  
  colorMode(HSB);
  // choose a random background color using HSB
  background(random(255), random(50,100),random(50,100));
  noFill();
  stroke(255,100);
  
  float i = 0;
  while(i < 70) {
    println(i);
    ellipse(width/2, height/2, 200+ i*2, 200-i*4); // 20 x 45
    i = i + 1;
  }
  print("end");  
 }


 
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_24" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
