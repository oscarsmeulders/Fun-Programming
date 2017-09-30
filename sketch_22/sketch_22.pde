// episode #22
// stars blinking at night fade out effect

void setup() {
  frameRate(16);
  size(400,300);
  background(0);
  noStroke();
}

void draw() {
  fill(0,12);
  rect(0,0,width,height);

  fill(255);
  line(random(width),random(height),40,40);
}