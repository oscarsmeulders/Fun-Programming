// episode 50 fun programming
// what are global and local variables

// global 
float a = 1;

void my_test() {
  // local
  float b = 55;
  println(a);
  println(b);
}

void setup() {
  // local
  float b = 77;
  println(a);
  println(b);
  my_test();
  println(b);
}