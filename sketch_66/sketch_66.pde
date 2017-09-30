// episode 67
// how random is random randomseed and noiseseed


size(500,400);
colorMode(HSB,80);
noStroke();

int x = 0;
int seed = int(random(10000000));

print(seed);
// randomSeed(2345); // i like this number 2345

randomSeed(4589656); // i like this number 2345

while (x < width) {
  int wi = int(random(100));
  fill(random(100), 80, 80);
  rect(x, 0, wi, height);

  x = x + wi;
}