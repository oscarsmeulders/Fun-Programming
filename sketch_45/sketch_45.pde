// episode 45 fun programming
// convert distances into colors or widths

float x = 0;
float a = 0;

size(500,300);
background(0);
colorMode(HSB, 100);


while(x < width) {

  float y = map(sin(a) * sin(a*2)* sin(a*1.4)* sin(a*8), -1,1,50,250);
  float co = map(y,50,250,0,100); 
  float sz = map(y,50,250,10,20);

  strokeWeight(sz);
  stroke(co, 100 ,100,100);  
  point(x,y);
  x = x + 1;
  a = a + 0.02;
}