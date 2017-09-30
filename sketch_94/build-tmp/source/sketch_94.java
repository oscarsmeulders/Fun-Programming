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

public class sketch_94 extends PApplet {
  public void setup() {
// fun programming #94
// boolean true or false? 

boolean friendHasMoney;
boolean iHaveMoney;

friendHasMoney = false;
iHaveMoney = false;

if(iHaveMoney || friendHasMoney) {
  print("We will buy ice cream");
} else {
  print("We can't buy ice cream");
}


// relational operators

// <	: less than
// <=	: less than or equal to
// >	: greater than
// >=	: greater than or equal to
// ==	: equal to
// /=	: not equal to
// || 	: or
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_94" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
