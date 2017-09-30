
// fun programming episode #78
// an array is like a book full of numbers

int pages = 100;
int[] x = new int[pages];
int[] y = new int[pages];
int[] z = new int[pages];

void setup() {
  size(500, 400, P3D);
  background(0);
  noFill();
  stroke(255);
  smooth();
  strokeWeight(1);
  for(int p = 0; p<pages; p++) {
    x[p] = int(random(-300, 300));
    y[p] = int(random(-300, 300));
    z[p] = int(random(-300, 300));
  }
}
void draw() {
  background(0);
  
  translate(width/2, height/2);
  
  rotateY(frameCount / 100.0);
  
  // fill(125, 125, 125, 80);
  box(250);
  

  for(int p = 0; p<pages; p++) {
    line(0, 0, 0, x[p], y[p], z[p]);
  }
}