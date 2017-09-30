import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_100 extends PApplet {

// fun programming episode #100
// sound and random rhythms




Minim soundengine;
AudioSample s1;
AudioSample s2;
AudioSample s3;
AudioSample s4;

int[] when = {0,16,24,32};


public void setup() {
	soundengine = new Minim(this);
	s1 = soundengine.loadSample("1.wav", 1024);
	s2 = soundengine.loadSample("2.wav", 1024);
	s3 = soundengine.loadSample("3.wav", 1024);
	s4 = soundengine.loadSample("4.wav", 1024);
//	frameRate(3);
}


// when to play sounds
public void draw() {

		if(frameCount % 64 == when[0]) {
			s1.trigger();
		}

		if(frameCount % 64 == when[1]) {
			s1.trigger();
		}


		if(frameCount % 64 == when[2]) {
			s3.trigger();
		}	

		if(frameCount % 64 == when[3]) {
			s4.trigger();
	}
		if(random(100) > 99) {
		int which = PApplet.parseInt(random(4));
		when[which] = 8 * PApplet.parseInt(random(8));
	}
}

public void stop() {
	s1.stop();
	s2.stop();
	s3.stop();
	s4.stop();
	soundengine.stop();
	super.stop();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_100" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
