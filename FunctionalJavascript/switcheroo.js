// Switcheroo
function switcheroo(binary) {
	return function(first, second) {
		return binary(second, first);
	}
}

function sub(first, second) {
	return first - second;
}

var bus = switcheroo(sub);
var result = bus(3, 2);
