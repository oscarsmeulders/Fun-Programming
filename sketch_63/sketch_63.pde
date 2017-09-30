
// episode #63 fun programming
// time for our first 3d animation

float a = 0; // box parameters translate
float r = 0; // rotate

void setup() {
  size(400, 400, P3D);
  noCursor();
}

void draw() {
  background(80);
  translate(mouseX, mouseY, map(noise(a), 0, 1, 200, 200));
  rotateY(r);
  box(50);
  
  a = a + 0.01;
  r = r + 0.1;
  
}