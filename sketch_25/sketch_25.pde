
// episode 25
// typing big letters that fade out

void setup() {
  size(400,400);
  background(#3355CC);
}

void draw() {
// fill(#3DB7A8);
// textSize(160);
// text("type something", 0, 240);

fill(#3355CC, 20);
rect(0,0,width,height);

  fill(#2C99F5);
  textSize(28);
  text("type something", 0, 300);
}

void keyPressed() {
    fill(#3DB7A8);
  textSize(random(20,200));
  text(key, random(400), random(100, 400));
  println(key);
}