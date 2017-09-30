// episode 57 fun programming
// a random sentence generator writes nonsense

int y = 50;

void write_word(String[] words) {
  int n = int (random(words.length));
  textSize(random(20,40));
  text(words[n], random(50, 150), y);
  y = y + 30;
}

void new_sentence() {
  
  background(0);
  y = 50;
  
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
};

void setup () {
  size(500, 400);
  background(0);
  fill(#40AA72);
  new_sentence();
}

void draw() {
}

void mousePressed() {
  new_sentence();
}

void keyPressed() {
  int random_num = int(random(1000000));
  save(random_num + ".png");
}