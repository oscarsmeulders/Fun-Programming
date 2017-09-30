// episode #72 fun programming
// create visual rhythms using modulo

int n = 0;

void setup() {
	size(400, 500);
	background(255);
	frameRate(2);
	noStroke();
	fill(50, 200, 50);
}

void draw() {
	background(255);
	print(n % 7);

	if (n % 7 == 0) {
		rect(20, 0, 100, 100);
	}

	if (n % 7 == 1) {
		rect(100, 0, 100, 100);
	}	 

	if (n % 7 == 2) {
		rect(200, 0, 100, 100);
	}
	n = n +1;	
}