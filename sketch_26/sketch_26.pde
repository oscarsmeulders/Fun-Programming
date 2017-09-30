// fun programming #26
// make patterns by rotating objects

size(400,300);
background(#6AA21E);
noStroke();
smooth();

float c = 0;

while (c < 100) {

  fill(random(255));
  rect(200,10,50,5);
  rotate(0.5);
  
  fill(random(80));
  rect(100,10,50,5);
  
  fill(random(66));
  rect(280,10,50,100);  
}



// rotate(0.5);
// rect(10,10,width-20,20);