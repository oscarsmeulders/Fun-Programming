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

public class sketch_160611a extends PApplet {

// point(50,50);
// point(51,50);
// point(52,50);
// point(53,50);
// point(54,50);
// point(55,50);

public void draw() {
  background(255,204,0);
  rect(random(100),random(100),random(100),random(100));
  ellipse(random(100),random(100),random(100),random(100));
  line(random(100),random(100),random(100),random(100));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160611a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
