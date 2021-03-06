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

public class sketch_46 extends PApplet {

// episode 46 fun programming
// create beautiful curves with lots of sin() calls

float a = 0;

public void setup() {
  
  background(0xff222222);
  colorMode(HSB, 120);
}

public void draw() {
  float x = map(sin(a)*sin(a*0.8f), -1, 1, 0, width);
  float y = map(sin(a*1.1f+1.5f)*sin(a*3.1f), -1, 1, 0, height);
  float co = map(sin(a*0.03f),-1,1,0,100);
  float sz = map(sin(a*1.7f)*sin(a*3.3f),-1,1,5,30);
  float bri = map(sin(a*1.3f)*sin(a*2.3f),-1,1,20,60);
  
  fill(co,120,bri);
  ellipse(x,y,sz,sz);

  noStroke();
  ellipse(x, y,40,40);
  a = a + 0.01f;
}
  public void settings() {  size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_46" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
