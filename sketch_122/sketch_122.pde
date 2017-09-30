// fun programming #122
// programming roses and other flowers

float k = 2/7.0;

void setup() {
  size(400, 400);
  background(#129575);
  colorMode(HSB);
  strokeWeight(0.01);
}
void draw() {
  translate(width/2, height/2);
  scale(200, 200);
  float t = frameCount / 20.0;
  float x = cos(k*t) * sin(t);
  float y = cos(k*t) * cos(t); 
  stroke(200);
  line(0, 0, x, y);
}