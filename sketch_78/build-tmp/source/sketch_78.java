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

public class sketch_78 extends PApplet {


// fun programming episode #78
// an array is like a book full of numbers

int pages = 100;
int[] x = new int[pages];
int[] y = new int[pages];
int[] z = new int[pages];

public void setup() {
  
  background(0);
  noFill();
  stroke(255);
  
  strokeWeight(1);
  for(int p = 0; p<pages; p++) {
    x[p] = PApplet.parseInt(random(-300, 300));
    y[p] = PApplet.parseInt(random(-300, 300));
    z[p] = PApplet.parseInt(random(-300, 300));
  }
}
public void draw() {
  background(0);
  
  translate(width/2, height/2);
  
  rotateY(frameCount / 100.0f);
  
  // fill(125, 125, 125, 80);
  box(250);
  

  for(int p = 0; p<pages; p++) {
    line(0, 0, 0, x[p], y[p], z[p]);
  }
}
  public void settings() {  size(500, 400, P3D);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_78" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
