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

public class sketch_31 extends PApplet {

// episode #31 fun programming
// function parameters and return values

// this function does not return any value, does not take any parameters
public void hello() {
  print("Hello!");
}

// a float is a number with decimals
// an int is a number with out decimals (interger)

public void print_sum(float a, float b) {
  print(a + b);
}

public float calculate_sum(float a, float b) {
  float c = a + b;
  return c;
}

public void setup() {
  hello();
  print_sum(10,10);

  float my_added_numbers = random(100,50);
  
  println(my_added_numbers);
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_31" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
