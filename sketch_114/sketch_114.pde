// fun programming #114
// how to create movies using processing

// c is color
int c = 255;

void setup() {
	size(640, 400);
	background(0);
	frameRate(25);
}

void draw() {
	noStroke();
	fill(c, random(100));
	rectMode(CENTER);

	float sz = random(200);

	rect(random(width), random(height),sz, sz);

	// every 200 frame condition will be true
	if(frameCount % 200 ==0) {
		// every 200 frames swaps color (c)
		c = 255 - c;
	}
	saveFrame("frame-####.tif");
	// program will render 1000 frames then stop
	if (frameCount > 100) { // 1000 / frameRate(25) = 40 secons
		noLoop();
	}
}