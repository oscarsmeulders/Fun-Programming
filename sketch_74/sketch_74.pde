// sketch #74 fun programming
// for loops and other ways of typing less

int csize = 50;
int grow = 1;
int n = 0;

void setup() {
	size(400, 400);
	noStroke();
	smooth();
	fill(255, 0, 0);	
}

void draw() {
	background(255);

	if (n % 20 == 0) {
		grow = 5;
	}

	if (csize > 60) {
		csize = 60;
		grow  = -2;
	}

	if (csize < 50) {
		csize = 50;
		grow = 0;
	}


	ellipse(200, 200, csize, csize);

	csize = csize + grow;

	n ++ ;
//	n = n +1;
	println("frameCount is " + frameCount);

}