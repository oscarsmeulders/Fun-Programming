// episode #16
// create an animated rainbow

void setup() {
  size(300,300);
  background(#04b1CE);
  noFill();
}

void draw() {

  strokeWeight(random(3,10));
  stroke(random(100,255),random(100,255),random(255)); // RGB
  
  float rainbowSize = random(200,270);
  
  ellipse(150,350,rainbowSize,rainbowSize);
}