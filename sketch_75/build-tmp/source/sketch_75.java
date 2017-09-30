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

public class sketch_75 extends PApplet {
  public void setup() {

// fun programming episode #75
// bezier curves are so beautiful

background(255);


noFill();


for(int i =0; i < 30; i++) {
  bezier(width/2, height, width/2, random(height), random(width), random(height), random(width), random(height)
  );
}
    noLoop();
  }

  public void settings() { 
size(500, 400); 
smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_75" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
