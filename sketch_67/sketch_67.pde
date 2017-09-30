// episode 67 fun programming
// circular motion sine and her cousin

float a = 0;
float b = 0;
float co = 0;

void setup() {
  background(#111111);
  colorMode(HSB, 100);
  size(500, 500);
  smooth();
  strokeWeight(4);
}

void draw() {

  stroke(co, 100, 100, 120);

  float x0 = map(sin(a), -1, 1, 40, width -80);
  float y0 = map(cos(a), -1, 1, 40, height -80);

  float x1 = map(sin(b), -1, 1, 40, width -80);
  float y1 = map(cos(b), -1, 1, 40, height -80);

  // background();
  // stroke(0);
  // point(x0,y0);
  // point(x1,y1);

  line(x0, y0, x1, y1);

  // --- sketch 1 -- //
  //  a = a + 0.02;
  //  b = b + 0.9;

  // --- sketch 2 -- //
  a = a + 0.04;
  b = b + 0.8;


  co = co +1;
  if (co > 200) {
    co = 0;
  }
}