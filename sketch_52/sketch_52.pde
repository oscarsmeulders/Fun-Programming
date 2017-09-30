// episode 52 fun programming
// convert float into int and animate a photo
// the drunk camera man effect

PImage photo;

// int a = int(random(200));
// float b = 7.23;
float a = 0;

void setup() {
  size(300, 300);
  photo = loadImage("rick-astley.jpg");
  background(40);
  stroke(255);

  println(a);
  // println(b);
}

void draw() {

  println(photo.width);
  println(photo.height);

  int wi = int(map(noise(a+30), 0, 1, 50, 200));
  int he = int(map(noise(a+40), 0, 1, 50, 200));
  int x = int(map(noise(a+10), 0, 1, 0, photo.width-wi));
  int y = int(map(noise(a+20), 0, 1, 0, photo.height-he));

  copy(photo, x, y, wi, he, 0, 0, width, height);
  // line(0, 100, width, 100);
  // line(0, 200, width, 200);
  a = a + 0.01;
}