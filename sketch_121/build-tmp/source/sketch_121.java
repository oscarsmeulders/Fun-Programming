import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_121 extends PApplet {

// fun programming #121
// using a webcam in processing



Capture cam;

public void setup() {
	println(Capture.list());
}

public void draw() {
	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_121" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
