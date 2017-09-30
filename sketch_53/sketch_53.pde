// episode 53 fun programming
// create a pattern by drawing 150000 pixels

size (500, 300);
colorMode(HSB, 12);

float x = 0;
while (x < width) {

  float y = 0;
  while (y < height) {
    // float v = noise(x/100, y/100);
    float v = sin(x/280 + y/280)*sin(x/25 - y/25);
    float h = map(v, -1, 1, 0, 10);
    stroke(h, 80, 80);
    point(x, y);
    y = y +1;
  }
  x = x +1;
}

// save a png to sketch folder
float saved = int (random(100000));
save(saved + ".png");