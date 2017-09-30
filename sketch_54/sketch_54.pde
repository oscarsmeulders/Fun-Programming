// episode 54 fun programming
// infinite forest combine random words using an array

background(0);
fill(255);

// use arrays

String[] nouns = {"forest", "tree", "flower", "sky", "grass", "mountain" };
String[] adjectives = {"happy", "rotating", "red", "green", "elastic", "smily", "unbelievable", "infinite"};

int n = int(random(6)); // random num between 0 and 5
int m = int(random(6)); // random num between 0 and 5

text(nouns [n], 30, 50);
text(adjectives[m], 30, 30);