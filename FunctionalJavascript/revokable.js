function revocable(nice) {
	return {
		invoke: function(arg) {
			if (nice) {
				return nice(arg);
			} else {
				return 'error';
			}
		},
		revoke: function() {
			nice = null;
		}
	};
};

function log(value) {
	return value;
}

function runRevokable() {
	var temp = revocable(log);
	invoke = temp.invoke;
	alert(invoke(7));
	temp.revoke();
	alert(invoke(8));
}