// fun programming episode #7
// animate horizontal lines using a variable

// animation
// white lines on black background
// the lines begin on the left border and end on the right border
// lines must be horizontal

void draw() {
  background(0);
  stroke(255);

  float distance_top = random(100);

  line(0,distance_top,99,distance_top);
}
