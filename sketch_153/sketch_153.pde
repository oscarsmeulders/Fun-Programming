// episode #153
// rendering processing shapes in blender

// using library from processing.org
import nervoussystem.obj.*;

PImage img;
boolean record = false;

void setup() {
	size(600, 400, P3D);
	img = loadImage("moon.jpg");
	img.loadPixels();
	noStroke();
}

void draw() {
	if(record) {
		beginRecord("nervoussystem.obj.OBJExport", "moon.obj");
	}

	background(255);
	lights();
	translate(width/2, height/2);
	scale(5);
	rotateX(mouseY * 0.01);
	rotateY(mouseX * 0.01);


//	image(img, 0, 0);

for(int x = 0; x < 100; x++){

	for(int y = 0; y < 100; y++) {

	// read color from width of image
	int imgx = (int)map(x, 0, 100, 0, img.width);
	// read color from width of image
	int imgy = (int)map(y, 0, 100, 0, img.width);
	// gets brightness from image
	float bri = brightness(img.get(imgx, imgy));
	if(bri > 50) {
	// draw boxes
	pushMatrix();
	translate(x, y);
	box(bri/100.0);
	popMatrix();
			}
		}
	}

	if(record) {
		endRecord();
		record = false;
	}
}

void keyPressed() {
  if(key == 's' || key == 'S') {
    record = true;
  }
}


