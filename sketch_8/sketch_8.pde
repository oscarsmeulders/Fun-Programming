// animate vertical lines #8
// animate horizontal lines using a variable

// animation
// white lines on black background
// the lines begin on the left border and end on the right border
// lines must be horizontal

void draw() {
  background(0);
  stroke(255);
  
  float distance_left = random(100);
  
  line(distance_left,0,distance_left,99);
}