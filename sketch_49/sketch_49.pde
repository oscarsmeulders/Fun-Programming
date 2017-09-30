// episode 49 fun programming
// show part of a loaded image using copy()

PImage photo;

void setup() {
  size(300, 300);
  photo = loadImage("rick-astley.jpg");
  background(40);
  stroke(255);
}

void draw() {
  copy(photo, 130, 130, 150, 150, 0, 100, width, 100);
  line(0, 100, width, 100);
  line(0, 200, width, 200);
}