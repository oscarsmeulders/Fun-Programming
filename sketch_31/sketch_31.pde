// episode #31 fun programming
// function parameters and return values

// this function does not return any value, does not take any parameters
void hello() {
  print("Hello!");
}

// a float is a number with decimals
// an int is a number with out decimals (interger)

void print_sum(float a, float b) {
  print(a + b);
}

float calculate_sum(float a, float b) {
  float c = a + b;
  return c;
}

void setup() {
  hello();
  print_sum(10,10);

  float my_added_numbers = random(100,50);
  
  println(my_added_numbers);
  
}