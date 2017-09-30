// episode 48 fun programming
// load an image of rick


// rick-astley-80s-hairstyle.jpg

float x;
PImage photo;

void setup() {
  x = width;
  size(400, 400);
  photo = loadImage("rick-astley-80s-hairstyle.jpg");
}

void draw() {
  background(0);
  image(photo, x, 0);

  if (x > 0) {
    x = x -1;
  }
}