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

public class sketch_118 extends PApplet {
  public void setup() {
// episdoe #118
// tips (copy paths, optimize, the binary AND operation)

// load a file from a path using the loadBytes array
byte data[] = loadBytes("/Users/rodblackney/Pictures/Irvue/9RqA6tnT0gA.png");
// println(data.length); // how many bytes are in the image


colorMode(HSB);

// loop through each byte in the array
// length finds ou
for(int i=0; i<width; i++) {
  int myhue = data[i] & 0xff;
  // set color max and min
  stroke(myhue, 255, 255);
//  line(i,0,i,height);
	rectMode(CENTER);
	rect(i, i, 140, 140);
}

// print(127 & 0xff);
// 0xff is another way to write 255

println(100 & 255);
    noLoop();
  }

  public void settings() { 
size(600, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_118" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
