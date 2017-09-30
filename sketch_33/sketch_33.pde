// fun programming #33
// use multiplication to scale up or down speeds or sizes

float x = 0;

void setup() {
  size(400,400);
  background(#C9FF29);
  fill(#529ED6);
  noStroke();

}

void draw() {
  translate(200,200);
 
  fill(255,0,0);
  ellipse(x * 0.5,0,10,10);
  
  fill(0,255,0);
  ellipse(x,40,10,10);
  
  
  fill(0,0,255);
  ellipse(x * 0.5,80,10,10);
  
  x = x + 1;
}