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

public class sketch_79 extends PApplet {


// fun programming episode #79
// a spinning star becomes a spinning plant

int pages = 100;
int[] x = new int[pages];
int[] y = new int[pages];
int[] z = new int[pages];

public void setup() {
  
  noFill();
  stroke(0, 255, 0); // green
  
  for(int p = 0; p<pages; p++) {
    x[p] = PApplet.parseInt(random(-150, 150));
    y[p] = PApplet.parseInt(random(-150, 0));
    z[p] = PApplet.parseInt(random(-150, 150));
  }
}
public void draw() {
  background(255);
  
  translate(width/2, height/2);
  
  // rotateY(mouseX/100.0); // rotates with mouse

  rotateY(map(mouseX,0,width,0,TWO_PI)); // one full rotation

  // rotateY(frameCount / 100.0); // rotate automatically
  
  // fill(125, 125, 125, 80);

  // box(300);  

  for(int p = 0; p<pages; p++) {
  //    line(0, 0, 0, x[p], y[p], z[p]);
    strokeWeight(1);
    bezier(0, 150, 0, 0, -150, 0, x[p], y[p], z[p], x[p], y[p], z[p]);
    point(x[p], y[p], z[p]);
  }
}





  public void settings() {  size(500, 400, P3D);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_79" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
