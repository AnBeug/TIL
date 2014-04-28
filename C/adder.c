    #include <stdio.h>
    
    int sum (int, int);
    
    typedef struct {
        float x;
        float y;
    } point;

    int main (void)
    {
        int total;
        point p;
        p.x = 7;
        p.y = 8;
    
        total = sum (2, 3);
        printf ("Total is %d\n", total);
    
        return 0;
    }
    
    int sum (int a, int b)
    {
        return a + b;
    }

    void add(point q, int z) {
        p.x = p.x + z;
        p.y = p.y + z;
    }