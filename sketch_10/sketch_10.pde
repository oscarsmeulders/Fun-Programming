// fun programming #10
// draw circles and rectangle, change fill color



void setup() {
  size (400,400);
  
  // tell the program that the x and y values in rect() mean center, not top left
  rectMode(CENTER);
  background(#4CBFEA);
  stroke(#F0F273);
  fill(#A02884);
  rect(200,200,150,150);
  ellipse(200,200,150,150);

}