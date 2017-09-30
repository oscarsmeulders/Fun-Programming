// episode 87 fun programming
// playing with shapes

void setup() {
	size(400,400);
	background(0);	
	textSize(20);
	println(nf(7,7)); // how many numbers you need this eg seven
}

void draw() {
	background(0);
	String message = "Current Time " + hour() + ":" + minute() + ":" + second();
	text(message,100,100);
	println(message.indexOf("T"));
}