// episode #18
// things that happen sometimes

float x = 0;

void setup() {
  size(400,400);
  background(0);
  stroke(255);
}

void draw() {
  line(x,200,x,100);
  x = x +1;
  
  if(x > width) {
    x = 0;
  }
  
  // random change line color
  
  // pick a number between 0 and 100
  if (random(100) > 50) {
  // change line color to black
    stroke(0);
  // otherwise change line color to white
  } else {
    stroke(255);
  }
}