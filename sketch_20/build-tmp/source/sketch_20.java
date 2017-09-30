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

public class sketch_20 extends PApplet {

// episode #20
// the smallest drawing program ever

public void draw() {  
  if (mousePressed == true) {
    point(mouseX,mouseY);
 }
}

public void keyPressed() {
  println("drawing saved");
  save("my_drawing.png");
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_20" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
