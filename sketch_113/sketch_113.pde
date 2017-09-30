// fun programming episode #113
// array of objects: hypnotic animation part II

Bug[] orecuho = new Bug[200];

void setup() {
  size(400, 400);
  smooth();
  noStroke();
  fill(35);
  for(int i=0; i<orecuho.length; i++) {
    float x = width/2 + cos(i/2.8) * i;
    float y = height/2 + sin(i/2.8) * i;
    orecuho[i] = new Bug(x, y, 0.20 - (i/1200.0) );
  }
}
void draw() {
  background(0, 150, 150);
  
  for(int i=0; i<orecuho.length; i++) {
    orecuho[i].live();
  }
}
