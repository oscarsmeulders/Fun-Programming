// episode #60 fun programming
// are two circles touching or intersecting

float diam = 100;
float a = 100;

void setup() {
  size(800, 800);
  background(0);
  noFill();
  noCursor();
}

void draw() {
  background(0);

  float x = noise(a, 10) * width;
  float y = noise(a, 20) * height;

  float d = dist(x, y, mouseX, mouseY);

  if (d > diam) {
    strokeWeight(8);
    println(" ");    
  } else {
    strokeWeight(random(10));
    print("circle touched");
  }


  stroke(255, 255, 0); 
  ellipse(x, y, diam, diam);

  stroke(0, 255, 0);
  ellipse(mouseX, mouseY, diam, diam);

  a = a + 0.002;
}