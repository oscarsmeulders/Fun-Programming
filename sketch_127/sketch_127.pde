// fun programming #127
// fun with filters

void setup() {
  size(400, 400);
  background(0);
  stroke(255);
  fill(255);
  textSize(80);
}
void draw() {
  fill(random(255), random(255), random(255));
  ellipse(random(width), random(height), 40, 40);
	filter(BLUR, 2);
//	filter(INVERT);
//	filter (POSTERIZE,2);
//	filter (ERODE);
//	filter (DILATE);
}