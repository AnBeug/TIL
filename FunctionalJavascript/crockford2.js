// Binary functions
function add(a, b) {
	return a + b;
}

function mul(a, b) {
	return a * b;
}

function curry(func, firstArg) {
	return function(secondArg) {
			return func(firstArg, secondArg);
	};
}

function applyf(func, first) {
	apply(func)(first);
}




// Runner
function testMe() {
	alert("Hello!");
}

function runner() {
	testMe();
}
