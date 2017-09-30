// fun programming #104
// oop means object oriented progamming

class Car {
	float x;
	float y;
	color c;

	// function has the same name as the class is called a constructor 
	Car(float carx, float cary, color carcolor) {
		x = carx;
		y = cary;
		c = carcolor;
	}

	// called from sketch_104.pde
	void drive (int speed) {
	x = x + speed;
	fill(c);
	rect(x, y, 40, 10); 
	}
}

