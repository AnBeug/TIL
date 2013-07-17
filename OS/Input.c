#include <stdio.h>

int main(void) 
{
  char s[100];

  gets(s); // read from standard input (don't use this--use fgets()!)

  fgets(s, sizeof(s), stdin); // read 100 bytes from standard input
}
