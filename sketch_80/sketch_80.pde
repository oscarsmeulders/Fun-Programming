// episode 80 fun programming
// the color datatype

int x = 324; // stores numbers with no decimals
float y = 123.7623; // stores numbers with decimals
String name = "Rose"; // a sequence of characters
PImage img;// loads image

color orange = #FC8E05; // color data type
color nice_blue = #2A78F2; // color data type
color white = color(255, 255, 255); // function to construct colors

println(orange);
println(nice_blue);

background(orange);

smooth();
strokeWeight(4);
stroke(white);
fill(nice_blue);
ellipse(50, 50, 60, 60);