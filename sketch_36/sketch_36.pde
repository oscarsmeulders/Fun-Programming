
// fun programming #36
// organic random animation using noise()

float my_num = 0;
float my_num2 = 1;

void setup() {
  size(400,400);
}


void draw() {
  background(255 * noise(my_num + 15));
  stroke(255);

  float x = noise(my_num) * width;
  line(x,0,x,height);
  
  float y = noise(my_num + 40) * height;
  line(0,y,width,y);
  
  my_num = my_num + 0.02;
  my_num2 = my_num2 + 0.03;
  
}