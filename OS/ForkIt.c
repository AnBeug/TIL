#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int     initialedData = 0;

int main(int argc, char *argv[])
{
    int uninitializedData;
    pid_t pid;
    pid_t ppid;

    uninitializedData = 10;

    printf("Parent: at the beginning\n");
    printf("\ni = %i, u = %i\n", initialedData, uninitializedData);

    if ((pid= fork()) < 0) {
        printf("forked wrongs");
    } else if (pid == 0) {
        initialedData = uninitializedData;
        uninitializedData = uninitializedData + 1;
        printf("Child:\n");
        printf("\ni = %i, u = %i\n", initialedData, uninitializedData);
        exit(0);
    }

    printf("Parent: at the end\n");
    printf("\ni = %i, u = %i\n", initialedData, uninitializedData);
    exit(0);
}