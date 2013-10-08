// Compose
function composeu(unaryA, unaryB) {
	return function(arg) {
		return unaryB(unaryA(arg));
	}
}

composeu(dbl, sqr)(3);
composeu(add, mul)(2, 3, 5);

// Composeb?