// episode #20
// the smallest drawing program ever

void draw() {  
  if (mousePressed == true) {
    point(mouseX,mouseY);
 }
}

void keyPressed() {
  println("drawing saved");
  save("my_drawing.png");
}