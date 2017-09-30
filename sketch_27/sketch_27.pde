// fun programming #27
// animating while rotating

float r =0;

void setup() {
  size(400,400);
  background(10);
  smooth();
  noStroke();
}

void draw() {
  fill(255);
  rotate(r); // rotation of screen is 0.2
  
  float circleSize = random(5,15);
  
  ellipse(20 + r,10,circleSize,circleSize);
  r = r + 0.1;
  println(r);
  }