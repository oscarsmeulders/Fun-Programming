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

public class sketch_87 extends PApplet {

// episode 87 fun programming
// playing with shapes

public void setup() {
	
	background(0);	
	textSize(20);
	println(nf(7,7)); // how many numbers you need this eg seven
}

public void draw() {
	background(0);
	String message = "Current Time " + hour() + ":" + minute() + ":" + second();
	text(message,100,100);
	println(message.indexOf("T"));
}
  public void settings() { 	size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_87" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
