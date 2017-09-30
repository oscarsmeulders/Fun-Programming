// fun programming episode #5
// light speed effect, change line colors

void setup() {
  // set up is only called once
  background(0);
}

void draw() {
  // draw runs over and over again
  // screen is 100px wide and 100px tall
  stroke(0,random(255),0);
  // draw random lines from the center
  line(50,50,random(100),random(100));
}