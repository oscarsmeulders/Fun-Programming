
// fun programming #143
// using PGraphics as layers in processing

PGraphics letters;
PGraphics squares;

void setup() {
	size(500, 500);
	letters = createGraphics(width, height);
	squares = createGraphics(width, height);
}

void draw() {

	background(0);

	letters.beginDraw();
	letters.text(int(random(10)), random(width), random(height));
	letters.endDraw();

	squares.beginDraw();
	squares.fill(#567D78);
	squares.noStroke();
	squares.rect(random(width), random(height), 40, 40);
	squares.endDraw();

	image(squares, 0, 0);
	image(letters, 0, 0);


}

