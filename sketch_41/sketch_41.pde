// episode 41 fun programming
// a function that generates sine waves

size(300,300);
background(#7FD8C6);

stroke(#2E6BB4);
line(0,50,width,50);
line(0,150,width,150);
line(0,250,width,250);

stroke(255);

float x = 0;
while(x < width) {
  point(x,50 + random(-10,10)); // between -10 and 10
  point(x,150 + 20 * noise(x/10)); // noise() between 0 and 1
  point(x, 250 + 20 * sin(x/10)); // sin() number between 1 and -1
  x = x + 1;
}