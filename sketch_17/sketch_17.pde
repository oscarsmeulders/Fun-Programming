// episode #17
// a better way to generate random colors

void setup() {
  size(300,300);
  background(#04b1CE);
  noFill();
  colorMode(HSB);
}

void draw() {

  strokeWeight(random(20,10));

  stroke(random(255),100,255); // Uses HSB not RGB
  
  float rainbowSize = random(200,270);
  
  ellipse(150,350,rainbowSize,rainbowSize);
}