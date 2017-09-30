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

public class sketch_120 extends PApplet {

// episode #120
// interactive file visualizer using loadBytes

// load a file from a path using the loadBytes array
byte data[] = loadBytes("image.png");
// println(data.length); // how many bytes are in the image

public void setup() {

colorMode(HSB);
}

public void draw() {
  float filePos = map(mouseX, 0, width, 0, data.length-width);
  for (int i=0; i<width; i++) {
    int myhue = data[i+PApplet.parseInt(filePos)] & 0xff;
    stroke(myhue, 255, 255);
    line(i, 0, i, height);
  }
 } 
// print(127 & 0xff);
// 0xff is another way to write 255
  public void settings() { 
size(600, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_120" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
