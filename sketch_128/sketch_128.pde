// fun programming #128
// fun with filters part two animated blobs

void setup() {
  size(600, 600);
  background(0);
  stroke(255);
  fill(255);
  textSize(80);
}

void draw() {


	// fills with white
	if(mousePressed) {

//		short hand if statements
//		fill(keyPressed ? 255 : 0);		
		
		if(keyPressed) {
			fill(0);

		// shift click to fill with black
		} else {
			fill(255);
		}


		// chooses char between 65 & 90 converts to a int asigns mouse positions
		text(char(int(random(65,90))), mouseX-30, mouseY+40);
	}
	  filter(BLUR, 2);
	  filter(THRESHOLD);
}