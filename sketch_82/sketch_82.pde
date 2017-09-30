// episode 82 fun programming
// program a gradient of colors

color c1;
color c2;

void setup() {
	size(250,250);
	colorMode(HSB,100);	

//	c1 = color (random(75), 20 ,100); // random color select

	c1 = color(200,100,100); // first color
	c2 = color(200,100,30); // second color

	for(int y = 0; y < height; y++) {
		float n = map(y, 0, height, 0, 1);
		color newc = lerpColor(c1, c2, n);
		stroke(newc);
		line(0, y, width, y);
	}
}


