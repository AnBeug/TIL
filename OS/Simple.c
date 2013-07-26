#include    <stdio.h>
#include	<stdlib.h>

int main(int argc, char *argv[], char *envp[])
{
	int i = 0;

    printf("hello, world\n");

    for (i = 0; i < argc; i++) {
    	printf("argv[%i] : %s\n", i, argv[i]);
    }

    for (i = 0; envp[i] != 0; i++) {
    	printf("envp[%i] : %s\n", i, envp[i]);
    }

    exit(-1);
}