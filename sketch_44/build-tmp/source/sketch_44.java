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

public class sketch_44 extends PApplet {
  public void setup() {
// episode 44 fun programming
// combine sine function to create crazy waveforms

float x = 0;
float a = 0;


background(0);
stroke(255);

while(x < width) {

  float y = map(sin(a) * sin(a*2)* sin(a*1.4f)* sin(a*8), -1,1,50,250);
  
  point(x,y);
  x = x + 1;
  a = a + 0.02f;
}
    noLoop();
  }

  public void settings() { 
size(500,300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_44" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
