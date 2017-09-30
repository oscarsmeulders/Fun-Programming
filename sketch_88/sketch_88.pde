// episode 88 fun programming
// change pixels using the pixels array

void setup() {
	size(500,400);
}

void draw() {

loadPixels();
	pixels[123456] = color(255,0,0);
	for(int i =0; i < pixels.length; i++) {
		pixels[i] = color(random(255));
	}
updatePixels();
}