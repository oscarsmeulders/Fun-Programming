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

public class sketch_80 extends PApplet {
  public void setup() {
// episode 80 fun programming
// the color datatype

int x = 324; // stores numbers with no decimals
float y = 123.7623f; // stores numbers with decimals
String name = "Rose"; // a sequence of characters
PImage img;// loads image

int orange = 0xffFC8E05; // color data type
int nice_blue = 0xff2A78F2; // color data type
int white = color(255, 255, 255); // function to construct colors

println(orange);
println(nice_blue);

background(orange);


strokeWeight(4);
stroke(white);
fill(nice_blue);
ellipse(50, 50, 60, 60);
    noLoop();
  }

  public void settings() { 
smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_80" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
