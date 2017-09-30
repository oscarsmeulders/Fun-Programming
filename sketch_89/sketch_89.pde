// fun programming #89
// create your own photo filters

void setup() {
	size(500,400);
	PImage img = loadImage("big_image.jpg");
	image(img,0,0);

	loadPixels();
	for(int i = 0; i < pixels.length; i++) {

		float r = red(pixels[i]);
		float g = 0; // removes green
		float b = blue(pixels[i]);


		pixels[i] = color(r,b,b + 0.8);
		// pixels[i] = color(r,g,b);
	}
	updatePixels();
}

void draw() {

}