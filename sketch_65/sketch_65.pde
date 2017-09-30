// episode 65 fun programming
// are we getting close use dist() to find out the distance

float x = 0;
float y = 0;
float d = 0;

float destx = 0;
float desty = 0;

void setup() {
  size(500, 400);
  fill(255, 0, 0);
  noStroke();
  destx = random(width);
  desty = random(height);
}
void draw() {
  background(255);
  ellipse(x, y, 20, 20);

  // lerp function can find out what's the middle point between two other points
  x = lerp(x, destx, 0.1);
  y = lerp(y, desty, 0.1);

  float d = dist(x, y, destx, desty);

  if (d < 1) {

    destx = random(width);
    desty = random(height);

    if (d < 50) {
      noFill();
      stroke(255, 0, 0);
      ellipse(x, y, 100-d, 100-d);
      noFill();
      stroke(255, 0, 0);
    }
  }


  println(d);
}