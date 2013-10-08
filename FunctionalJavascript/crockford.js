// Apply called functions
function idenfityf(x) {
	return function(x) {
		return x;
	}
}

function apply(binary) {
	return function(first) {
		return function(second) {
			return binary(first, second);
		}
	}
}

// var addf = applyf(add);
// addf(3)(4);

function addf(x) {
	return function (x, y) {
		return x + y;
	}
}


// Curry
function curry(func, firstArg) {
	return function(secondArg) {
			return func(firstArg, secondArg);
	};
}

function applyf(func, first) {
	apply(func)(first);
}

// Increment
// var inc1 = addf(1);
var inc2 = applyf(add, 1);
var inc3 = curry(addf)(1);


// Twice
function twice(binary) {
	return function(a) {
		return binary(a, a);
	}
}

add(11, 11)
var dbl = twice(add);
dbl(11);
var sqr = twice(mul);
sqr(11);

// Runner
function testMe() {
	alert("Hello!");
}

function runner() {
	testMe();
}
