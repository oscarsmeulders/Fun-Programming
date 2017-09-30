// fun programming episode #112
// array of objects: hypnotic animation part I

Bug orechuo;

void setup() {
	size(400, 400);
	smooth();
	noStroke();
	fill(255);
	orechuo = new Bug(100,100,15);	
}

void draw() {
	background(150, 0, 0);	

	orechuo.live();
}