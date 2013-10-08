function counter(value) {
	return {
		inc = function() {
			value = value + 1;
			return value;
		},
		dec = function() {
			value = value - 1;
			return value;
		},
		get = function() {
			return value;
		}
	}
}

function runCounter() {
	var counter = counterf(10);
	var inc = counter.inc,
	    dec = counter.dec;
	 inc();
	 dec();
}