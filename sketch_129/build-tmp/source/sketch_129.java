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

public class sketch_129 extends PApplet {

public void setup() {
  
  noStroke();
  rectMode(CENTER);
}
public void draw() {
  fill(224, 74, 40);
  background(236, 211, 95);

  for(int y=42; y<height; y+=45) {

    for(int x=34; x<height; x+=27) {

      resetMatrix();

      translate(x, y);

      rotate(TWO_PI * noise(x/270.5f, y/234.6f, frameCount / 70.8f));

      rect(0, 0, 22, 26);
    }
  }
}



  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_129" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
