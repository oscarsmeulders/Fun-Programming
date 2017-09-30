// episode #19
// tweak the barcode, create your first function

float x = 0;

void setup() {
  size(400,400);
  background(255);
  stroke(255);
}

void change_line_color() {
  stroke(255,0,0);
  line(x,100,x,200);
  
  // decide if to use black or white
  if (random(100) > 50) {
    stroke(0);
  } else {
    stroke(255);    
    }
  }

void draw() {
  // draw a black or white line
  line(x,100,x,200);

  // change the line color 
  if(random(100) > 20) {
    change_line_color();
  }

  x = x +1;
  if(x > width) {
    x = 0;
  }

}