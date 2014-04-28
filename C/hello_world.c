#include <stdio.h>


int main(int argc, char** argv) {
  int i = 0;

  for (; i < 5; i++) {
  	puts("Hello, world!");  	
  }
  
	i = 0;
	while (i < 5) {
		puts("Hello again.");
		i++;
	}

  return 0;
}