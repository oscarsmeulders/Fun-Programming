
// fun programming episode #76
// a 3d rotating cloud of points

int amount = 800;
int [] x = new int [amount];
int [] y = new int [amount];
int [] z = new int [amount];

void setup() {
	size(300, 300, P3D);
	background(0);
	noFill();
	stroke(255);
	strokeWeight(1);

	for (int i = 0; i < 100; i++) {
		x[i] = int (random(-150,150));
		y[i] = int (random(-150,150));
		z[i] = int (random(-150,150));
	}
}

void draw() {
//	background(0);
	translate(width/2, height/2);
	rotateY(frameCount/100.0);
	// box(300);

	for(int i = 0; i < amount; i++) {
		point(x[i], y[i], z[i]);
	}

}