function gensymf(prefix) {
	var count = 0;

	return function() {
		count = count + 1;
		return prefix + count;
	}
}

function runner() {
	var gensym = gensymf('G');
	alert(gensym());	// "G1"	
	alert(gensym());	// "G2"	
	alert(gensym());	// "G3"	
	alert(gensym());	// "G4"	

	var gensym2 = gensymf("A");
	alert(gensym2());	// "A1"
}