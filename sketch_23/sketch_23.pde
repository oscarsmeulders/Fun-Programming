
// episode #23
// using the while loop

void setup() {
  size(400,400);
  colorMode(HSB);
  // choose a random background color using HSB
  background(random(255), random(50,100),random(50,100));
  noFill();
  stroke(255,100);
  
  int i = 0;
  while(i < 80) {
    println(i);
    ellipse(100 + i*2,100+ i*3,100+ i*8,100+ i*8); // 20 x 45
    i = i + 1;
  }
  print("end");  
 }


 