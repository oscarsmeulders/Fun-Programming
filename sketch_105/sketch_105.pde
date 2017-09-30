// fun programming #105
// oop means object oriented progamming

// create an array for cars
Car[] cars = new Car[10];

void setup() {
	size(500, 500);
	// .length adjusts to amount in Car[100] array
	// loop creates 100 cars
	for(int i=0; i<cars.length; i++) {
		cars[i] = new Car(20, random(height), #0AA8F5);
		}
}

void draw() {
	background(255);
	for (int i=0; i <cars.length; i++) {
		cars[i].drive(i);
	}
}