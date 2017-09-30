// fun programming episdoe #86
// drawing shapes with your mouse

float d = 20;
PImage back_image;

void setup() {
	size(500, 500);
	background(#FF760D);
	noFill();
	stroke(255);
	strokeWeight(8);
	smooth();	
	back_image = loadImage("new_back.jpg");
}

void draw() {
	background(back_image);
//	image(back_image, mouseX, mouseY);
	ellipse(mouseX, mouseY, d, d);

	if(mousePressed) {
		d++;
	}
}

void mouseReleased() {
	loadPixels();
	back_image.pixels = pixels;

	d = 20;
}









