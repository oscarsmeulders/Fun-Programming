// episode 34 fun programming
// create a grid of objects with nested while loops

size(400, 400);
noStroke();
background(23, 100, 240);

float x = 0;

while (x < width) {
  float y = 0;
  while (y < height) {    
    fill(random(0, 255));
    ellipse(x +20, y +20, 18, 18);
    y = y +20;
  }
  x = x +20;
} 