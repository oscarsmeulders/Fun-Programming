// animate vertical lines #9
// change screen size, animate colorful lines

// animation
// white lines on black background
// the lines begin on the left border and end on the right border
// lines must be horizontal

void setup() {
  size(200,200);
  background(0);
}

void draw() {
  // background(0);
  stroke(random(200,256),random(200,256),random(50,100));
  // random line drawn from size of screen in setup
  float distance_left = random(200);
  line(distance_left,0,distance_left,199);
}