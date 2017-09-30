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

public class sketch_105 extends PApplet {

// fun programming #105
// oop means object oriented progamming

// create an array for cars
Car[] cars = new Car[10];

public void setup() {
	
	// .length adjusts to amount in Car[100] array
	// loop creates 100 cars
	for(int i=0; i<cars.length; i++) {
		cars[i] = new Car(20, random(height), 0xff0AA8F5);
		}
}

public void draw() {
	background(255);
	for (int i=0; i <cars.length; i++) {
		cars[i].drive(i);
	}
}
// fun programming #104
// oop means object oriented progamming

class Car {
	float x;
	float y;
	int c;

	// function has the same name as the class is called a constructor 
	Car(float carx, float cary, int carcolor) {
		x = carx;
		y = cary;
		c = carcolor;
	}

	// called from sketch_104.pde
	public void drive (int speed) {
	x = x + speed;
	if(x > width) {
		x = 0;
	}
	fill(c);
	rect(x, y, 40, 10); 
	}
}

  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_105" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
