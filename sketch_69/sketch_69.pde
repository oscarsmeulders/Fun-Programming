
// fun programming episode #64
// combine circular and other motions

float x = 8;
float y = 8;

float a = 0; // fast motion
float b = 0; // slow motion

void setup() {
	size(512, 512);
	background(255);
	noStroke();
	smooth();
}

void draw() {
	x = width/2;
	y = height/2;
	
	// change these vaules
	fill(0, 80, 0);
	float x2 = sin(a) * 140; 
	float y2 = cos(a) * 140;
  
	float x3 = sin(b) * 90;
	float y3 = cos(b) * 90;
    
	fill(180, 0, 0);
	ellipse(x + x2 + x3, y + y2 + y3, 18, 18); // adds values together to create shape

	a = a + 0.01; // fast
	b = b + 0.1; // slow

}