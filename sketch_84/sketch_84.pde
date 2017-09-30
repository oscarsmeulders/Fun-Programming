// episode 84 fun programming
// draw gradients, review functions and image loading

PImage back;

void setup() {
	size(250,250);
	colorMode(HSB,100);
	noFill();
	smooth();
	strokeWeight(2);
	background(0);
	back = loadImage("data/image.jpg");
	image(back,0,0);
}

void draw_circ_grad(int x, int y, int maxd) {
  	color c1 = color(random(100), 100, 100);
  	color c2 = color(random(100), 100, 30);

//	float maxd = 300;

	for(int d = 0; d < maxd; d++) {
		float n = map(d, 0, maxd, 0, 1);
		color newc = lerpColor(c1, c2, n);
		stroke(newc);
		ellipse(x, y, d, d);
	}
}


void mousePressed() {

	draw_circ_grad(mouseX,mouseY, int(random(50,300)));
//	println(mouseX);
//	println(mouseY);
}



void draw() {

}


