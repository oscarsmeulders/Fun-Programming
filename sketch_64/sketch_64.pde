// episode 64 fun programming
// animate objects that slow down and stop using lerp()

float x = 0;
float y = 0;

void setup() {
  size(500, 400);
  fill(255, 0, 0);
  noStroke();
}
void draw() {
  background(255);
  ellipse(x, y, 20, 20);
  
  // lerp function can find out what's the middle point between two other points
  x = lerp(x, mouseX, 0.05);
  y = lerp(y, mouseY, 0.05);
}