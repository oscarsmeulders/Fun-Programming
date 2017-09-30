// fun programming #12
// do a loop animation using an if() statement

float slow_circle_x = 0;
float fast_circle_x = 0;

void setup() {
  size(400,400);
  noStroke();
  
}

void draw() {
  background(#1881F5);

  fill(#C1FF3E);
  ellipse(slow_circle_x,50,50,50);
  slow_circle_x = slow_circle_x +1;
  
  fill(#DB3CB6);
  ellipse(fast_circle_x,50,50,50);
  fast_circle_x = fast_circle_x +5;
 
 // when slow_circle_x reaches the edge 400 go back to 0
  if (slow_circle_x > 400) {
    slow_circle_x = 0;
  }

 // when fast_circle_x reaches the edge 400 go back to 0
  if (fast_circle_x > 400) {
    fast_circle_x = 0;
  }

   
   
}