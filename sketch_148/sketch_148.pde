
// episode #148 fun programming
// drawing shapes with glow or shadows

void setup() {
	size(675, 675);
	colorMode(HSB);
	rectMode(CENTER);
	frameRate(5);
}

void draw() {
	background(0);
	for (int i = 0; i < 20; ++i) {
		pushMatrix();
		translate(width/2, height/2);
		rotate(i);
		glowingRect((i % 5) * 20, (i % 4) * 15, 120, 80, #22FF66, #406661, mousePressed);
//		glowingRect((i % 5) * 20, (i % 4) * 15, 10, #22FF66, #FF6622);
		popMatrix();
	}
}

void glowingRect (float x, float y, float w, float h, color fillColor, color glowColor, boolean effectActive) {


	// if effect Active draws 
	if(effectActive) {

	stroke(glowColor, 10);
	strokeWeight(18);
	rect(x, y, w, h);

	stroke(glowColor, 20);
	strokeWeight(19);
	rect(x, y, w, h);

	stroke(glowColor, 30);
	strokeWeight(20);
	rect(x, y, w, h);

	stroke(glowColor, 40);
	strokeWeight(31);
	rect(x, y, w, h);

}
	noStroke();
	fill(fillColor);
	rect(x, y, w, h);
}