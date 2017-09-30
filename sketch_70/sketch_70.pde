// fun programming episode #70
// slowly change the direction

float oldx; // last x position
float oldy; // last y position
float a; // angle

void reset() {
	oldx = width/2;
	oldy = height/2;
	a = random(TWO_PI); // converts
	stroke(random(255), 255, 255);
}

void setup() {
	size(500, 400);
	background(255);
	colorMode(HSB,100);
	smooth();
	noFill();
	reset();
}

void draw() {
	float newx = oldx + cos(a) * 5;
	float newy = oldy + sin(a) * 5;
	line(oldx, oldy, newx, newy);
	oldx = newx;
	oldy = newy;
	a = a + random(-0.4, 0.4);
}

