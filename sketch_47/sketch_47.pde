// episode 47 fun programming
// share your processing program with the world

void setup() {
  size(400, 400);
  background(#B1FF0A);
  noFill();
  smooth();
}
void draw() {
  if (random(100) > 120) {
    stroke(#B1FF0A);
  } else {
    stroke(#FFFFFF);
  }
  float r = random(100);
  ellipse(width/2, height/2, r, r);
  
  copy(10, 0, width, height, -3, -2, width + 5, height + 3);
}