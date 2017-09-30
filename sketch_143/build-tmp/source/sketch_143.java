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

public class sketch_143 extends PApplet {


// fun programming #143
// using PGraphics as layers in processing

PGraphics letters;
PGraphics squares;

public void setup() {
	
	letters = createGraphics(width, height);
	squares = createGraphics(width, height);
}

public void draw() {

	background(0);

	letters.beginDraw();
	letters.text(PApplet.parseInt(random(10)), random(width), random(height));
	letters.endDraw();

	squares.beginDraw();
	squares.fill(0xff567D78);
	squares.noStroke();
	squares.rect(random(width), random(height), 40, 40);
	squares.endDraw();

	image(squares, 0, 0);
	image(letters, 0, 0);


}

  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_143" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
