// episode #24
// circle patterns with a while loop

void setup() {
  size(400,400);
  colorMode(HSB);
  // choose a random background color using HSB
  background(random(255), random(50,100),random(50,100));
  noFill();
  stroke(255,100);
  
  float i = 0;
  while(i < 70) {
    println(i);
    ellipse(width/2, height/2, 200+ i*2, 200-i*4); // 20 x 45
    i = i + 1;
  }
  print("end");  
 }


 