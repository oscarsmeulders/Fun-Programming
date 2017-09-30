// fun programming #105
// oop means object oriented progamming

Car car1;
Car car2;

void setup() {
	size(500, 500);
	car1 = new Car(20,100, #0AA8F5);
	car2 = new Car(20,150, #F5470C);
}

void draw() {
	background(255);
	car1.drive(1);
	car2.drive(2);
}