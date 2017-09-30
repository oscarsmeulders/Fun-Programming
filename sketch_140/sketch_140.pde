
// fun programming #140
// recursive programming

void setup() {
	size(600,600);
	background(#1D2B53);
	noStroke();
	recursiveThing(width/2, height/2, 400);
}

void recursiveThing(float x, float y, float sz) {
	// sz size
	float a, nx, ny;
	fill(lerpColor (#FF004D, #FFF024, random(1)));
	ellipse(x, y, sz, sz);
	if(sz > 12) {

		a = random(HALF_PI);
		nx = x + sz/2 + sin(a);
		ny = y + sz/2 + cos(a);
		recursiveThing(nx, ny, sz/2);

		a = random(HALF_PI);
		nx = x + sz/2 * sin(a);
		ny = y + sz/2 * cos(a);
		recursiveThing(nx, ny, sz/2);

		a = random(TWO_PI);
		nx = x + sz/2 * sin(a);
		ny = y + sz/2 * cos(a);
		recursiveThing(nx, ny, sz/2);
	}
}

