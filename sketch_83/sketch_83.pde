// episode 83 fun programming
// circular gradients can look like spheres

color c1;
color c2;


void setup() {
	size(250,250);
	colorMode(HSB,100);
	noFill();
	strokeWeight(2);
	background(0);

//	c1 = color (random(75), 20 ,100); // random color select

	c1 = color(random(200),100,100); // first color
	c2 = color(random(100),30); // second color

	float maxr = 300;

	for(int r = 0; r < maxr; r++) {
		float n = map(r, 0, maxr, 0, 1);
		color newc = lerpColor(c1, c2, n);
		stroke(newc);
		ellipse(100, 100, r, r);
	}
}


