#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/wait.h>

int main(void)
{
    pid_t   pid;

    if ((pid = fork()) < 0) {
        perror("fork error");
        exit(-1);
    } else if (pid == 0) {
    	// Fork in the child
        if (execlp("Executee", "Executee", "arg1", (char *)0) < 0) {
            perror("execlp error");
            exit(-1);            
        }
    }

    if (waitpid(pid, NULL, 0) < 0) {
        perror("wait error");
        exit(-1);
    }

    exit(0);
}