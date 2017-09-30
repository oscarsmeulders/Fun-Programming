// episdoe #118
// tips (copy paths, optimize, the binary AND operation)

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
	rectMode(CENTER);
	rect(i, i, 140, 140);
}

// print(127 & 0xff);
// 0xff is another way to write 255

println(100 & 255);