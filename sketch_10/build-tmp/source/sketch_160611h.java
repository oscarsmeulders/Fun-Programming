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

public class sketch_160611h extends PApplet {

// fun programming #10
// draw circles and rectangle, change fill color



public void setup() {
  
  
  // tell the program that the x and y values in rect() mean center, not top left
  rectMode(CENTER);
  background(0xff4CBFEA);
  stroke(0xffF0F273);
  fill(0xffA02884);
  rect(200,200,150,150);
  ellipse(200,200,150,150);

}
  public void settings() {  size (400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160611h" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
