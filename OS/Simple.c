#include <stdio.h>

int main(void) {
  printf ("hello world.\n");
  anotherFunc(3);
  exit(0);
}

void anotherFunc(int n) {
	int i;
	for (i = 0; i < n; i++) {
		printf("hello");
	}
	printf("\n");
}
