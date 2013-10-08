
// Once
function once(func) {

	return function(first, second) {
		var temp;
		if (func) {
			temp = func;
			func = false;
			return temp(first, second);
		} else {
			return "error";
		}
	}
}

var add_once = once(add);
add_once(3, 4);	// 7
add_once(3, 5);	// error
