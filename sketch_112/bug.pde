// bug



class Bug {
	float x;
	float y;
	float sz; // size

	float maxsz; // max size
	float minsz; // min size
	float grow;

	Bug(float tx, float ty, float tsz) {
		x = tx;
		y = ty;
		sz = tsz;

		maxsz = 20;
		minsz = 10;
		grow = random(0.2,0.8);
	}

void live() {
	ellipse(x, y, sz, sz);
	sz = sz + grow;

	// grow to max size
	if (sz > maxsz) {
		sz = maxsz;
		grow = -grow;
	}
    
    // grow to minimum size
    if (sz < minsz) {
    	sz = minsz;
    	grow = -grow;
	    }
    }
}