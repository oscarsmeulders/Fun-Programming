// fun programming episode #6
// animate white lines across the display

// animation
// white lines on black background
// the lines begin on the left border and end on the right border

void draw() {
  background(0);
  stroke(255);
  line(0,random(100),99,random(100));
}