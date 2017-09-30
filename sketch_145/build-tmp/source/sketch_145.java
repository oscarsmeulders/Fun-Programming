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

public class sketch_145 extends PApplet {


// fun programming #145
// export animation frames, convert to animgif using gifsicle

int frames = 20;
int framesToSave = 0;
PGraphics pg[] = new PGraphics[frames];

public void setup() {
	
	prepareGraphics();
	for (int i = 0; i < frames; i++) {
		pg[i] = createGraphics(width, height);
	    pg[i].beginDraw();
		pg[i].background(0);
		pg[i].stroke(255);
		pg[i].strokeWeight(8);
		pg[i].endDraw();		
	}
}

public void draw() {

	int currFrame = frameCount % frames; // 0 ... 19
	
	if(mousePressed) {
		pg[currFrame].beginDraw();
		pg[currFrame].line(mouseX, mouseY, pmouseX, pmouseY);
		pg[currFrame].endDraw();
	}

	image(pg[currFrame], 0, 0);
	if(framesToSave > 0) {
			saveFrame("loop###.gif");
		framesToSave--;
	}
}

public void keyPressed() {
  if (key == 's') {
    framesToSave = frames;
  }
  if (key == ' ') {
    prepareGraphics();
  }
}

public void prepareGraphics() {
for (int i = 0; i < frames; i++) {
		pg[i] = createGraphics(width, height);
	    pg[i].beginDraw();
		pg[i].background(0);
		pg[i].stroke(255);
		pg[i].strokeWeight(8);
		pg[i].endDraw();		
	}
}

  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_145" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
