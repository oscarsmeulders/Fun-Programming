// fun programming #90
// change pixel hue, saturation and brightness

void setup() {
	size(600, 600);
	colorMode(HSB);

	PImage img = loadImage("big.png");
	image(img, 0, 0);

// place code block into draw
	loadPixels();
	for(int i=0; i < pixels.length; i++) {
		float b = brightness(pixels[i]);
		float s = saturation(pixels[i]);
		float h = hue(pixels[i]);
		pixels[i] = color(255 - h,s + 20, b + 78);
	}
	updatePixels();
// --------- //

}

void draw() {

}
