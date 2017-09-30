
// fun programming #37
// make a rectangle dance using noise

float my_num = 10;

void setup() {
  size (400,400);
  background(#8102cf);
  fill(255);
  noStroke();
  smooth();
  rectMode(CENTER);
}

void draw() {
  background(#8102cf);
  translate(width * noise(my_num + 80), height * noise(my_num + 100));
  rotate(5 * noise(my_num));
  rect(0,0,200 * noise(my_num),200 * noise(my_num + 20));
  
  my_num = my_num + 0.02;

}