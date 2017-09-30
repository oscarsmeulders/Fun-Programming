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

public class sketch_104 extends PApplet {

// fun pro

Car car1;
Car car2;

public void setup() {
	
	car1 = new Car(20,100, 0xff0AA8F5);
	car2 = new Car(20,150, 0xffF5470C);
}

public void draw() {
	background(255);
	car1.drive(1);
	car2.drive(2);
}

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
	x = x +speed;
	fill(c);
	rect(x, y, 40, 10); 
	}
}

  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_104" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
