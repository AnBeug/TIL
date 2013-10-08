#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int     n;
    int     fd[2];
    pid_t   pid;
    char    line[1000];

    if (pipe(fd) < 0) {
        perror("pipe error");
        exit(-1);
    }
    if ((pid= fork()) < 0) {
        perror("fork error");
        exit(-1);
    } else if (pid > 0) {        /* parent */
        close(fd[0]);
        write(fd[1], "hello world\n", 12);
    } else {                     /* child */
        close(fd[1]);
        n = read(fd[0], line, 1000);
        write(STDOUT_FILENO, line, n);
    }
    exit(0);
}