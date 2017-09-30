// episode #71 fun programming
// playing with directions

float oldx; // last x position
float oldy; // last y position
float a; // angle
float w; // width

void reset() {
	oldx = width/2; // resets to center
	oldy = height/2;
	a = random(TWO_PI); // converts
	stroke(255);
	w = 1; // reset width to 1
}

void setup() {
	size(500, 400);
	background(#222222);
	colorMode(HSB,100);
	smooth();
	noFill();
	reset();
}

void draw() {
	stroke(20,80,noise(w,a)*100); // set stroke color
	strokeWeight(w);
	float newx = oldx + cos(a) * 8;
	float newy = oldy + sin(a) * 8;
	line(oldx, oldy, newx, newy);
	oldx = newx;
	oldy = newy;

	a = a + random(-0.8, 0.8); // randomly changes angle
	w = w + 0.4; // 

	if(oldx < 0 || oldy < 0 || oldx > width || oldy > height) {
		reset();
	} 
}