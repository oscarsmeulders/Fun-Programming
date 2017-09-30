
// episode #68 fun programming
// circular motion reviewed

float a = 0;

void setup() {
  size(500, 400);
}


void draw() {
  float r = random(140, 140);
  float x = width /2 + cos(a) * r;
  float y = height /2 + sin(a) * r;
  noStroke();
  ellipse(x, y, 10, 10);
  a = a + 0.1;
  if (a > TWO_PI) {
    noLoop();
  }
}