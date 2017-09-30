// episode 43 fun programming
// animate using sin() less math thanks to map()

float a = 0;

void setup() {
  size(400, 400);
  background(#BAFF0D);
  fill(#556F15);
  noStroke();
  smooth();  
}

void draw() {
  background(#BAFF0D); 
  float x = map(sin(a),-1,1,0, width);
  ellipse(x, 200, 80, 80);
  a = a + 0.03; 
}