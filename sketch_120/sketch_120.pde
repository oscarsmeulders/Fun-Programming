// episode #120
// interactive file visualizer using loadBytes

// load a file from a path using the loadBytes array
byte data[] = loadBytes("image.png");
// println(data.length); // how many bytes are in the image

void setup() {
size(600, 500);
colorMode(HSB);
}

void draw() {
  float filePos = map(mouseX, 0, width, 0, data.length-width);
  for (int i=0; i<width; i++) {
    int myhue = data[i+int(filePos)] & 0xff;
    stroke(myhue, 255, 255);
    line(i, 0, i, height);
  }
 } 
// print(127 & 0xff);
// 0xff is another way to write 255