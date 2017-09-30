// fun programming #117
// reading and displaying bytes part two

// load a file from a path using the loadBytes array
byte data[] = loadBytes("/Users/rodblackney/Pictures/Irvue/9RqA6tnT0gA.png");
// println(data.length); // how many bytes are in the image

size(600, 500);
colorMode(HSB);

// loop through each byte in the array
// length finds ou
for(int i=0; i<width; i++) {
  int myhue = data[i] & 0xff;
  // set color max and min
  stroke(myhue, 255, 255);
//  line(i,0,i,height);

  rect(i, i, width, height);
}