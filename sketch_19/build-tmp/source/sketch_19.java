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

public class sketch_19 extends PApplet {

// episode #19
// tweak the barcode, create your first function

float x = 0;

public void setup() {
  
  background(255);
  stroke(255);
}

public void change_line_color() {
  stroke(255,0,0);
  line(x,100,x,200);
  
  // decide if to use black or white
  if (random(100) > 50) {
    stroke(0);
  } else {
    stroke(255);    
    }
  }

public void draw() {
  // draw a black or white line
  line(x,100,x,200);

  // change the line color 
  if(random(100) > 20) {
    change_line_color();
  }

  x = x +1;
  if(x > width) {
    x = 0;
  }

}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_19" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
