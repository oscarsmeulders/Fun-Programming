// fun programming #11
// non-random animation of a circle crossing the screen

float circle_x = 0;

void setup() {
  size (400,400);
  background(#C1FF3E);
  noStroke();
  fill(#ffffff);
}

void draw() {
  background(#C1FF3E);
//  ellipse(circle_x,50,random(80),random(80));
  ellipse(circle_x,50,50,50);
  circle_x = circle_x +1;
}