// episode 46 fun programming
// create beautiful curves with lots of sin() calls

float a = 0;

void setup() {
  size(600, 600);
  background(#222222);
  colorMode(HSB, 120);
}

void draw() {
  float x = map(sin(a)*sin(a*0.8), -1, 1, 0, width);
  float y = map(sin(a*1.1+1.5)*sin(a*3.1), -1, 1, 0, height);
  float co = map(sin(a*0.03),-1,1,0,100);
  float sz = map(sin(a*1.7)*sin(a*3.3),-1,1,5,30);
  float bri = map(sin(a*1.3)*sin(a*2.3),-1,1,20,60);
  
  fill(co,120,bri);
  ellipse(x,y,sz,sz);

  noStroke();
  ellipse(x, y,40,40);
  a = a + 0.01;
}