// episode 56 fun programming
// silly poet writes absurd things

void write_word(String[] words) {
  int n = int (random(words.length));
  print(words[n]);
  print(" ");
}

void setup () {

  background(0);
  fill(255);

  // one happy tree was thinking above one smily ocean

  String[] art = {"this", "that", "one", "the"}; // articles
  String[] nou = {"forest", "tree", "flower", "sky", "grass", "mountain" }; // noun
  String[] adj = {"happy", "rotating", "red", "fast", "elastic", "smily", "unbelievable", "intelligent", "sky"}; // adjectives
  String[] ver = {"runs", "is thinking", "was flying", "observes"  }; // verbs
  String[] pre = {"above", "inside", "behind", "in front of"}; // preposition

  write_word(art);
  write_word(adj);
  write_word(nou);
  
  write_word(ver);
  write_word(pre);

  write_word(art);
  write_word(adj);
  write_word(nou);


//  int n = int(random(6)); // random num between 0 and 5
//  int m = int(random(6)); // random num between 0 and 5

//  text(nou [n], 30, 50);
//  text(adj [m], 30, 30);
}