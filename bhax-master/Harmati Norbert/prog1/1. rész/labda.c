#include <stdio.h>
#include <stdlib.h>
#include <curses.h>
#include <unistd.h>

int
main (void)
{
    int xj = 0, xk = 0, yj = 0, yk = 0;
    int mx = 165 * 2, my = 38 * 2;

    WINDOW *ablak;
    ablak = initscr ();
    curs_set(FALSE);
    for (;;)
    {
        xj = (xj - 1) % mx;
        xk = (xk + 1) % mx;

        yj = (yj - 1) % my;
        yk = (yk + 1) % my;

        clear ();

        mvprintw (0, 0,
                  "--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        mvprintw (38, 0,
                  "--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        mvprintw (abs ((yj + (my - yk)) / 2),
                  abs ((xj + (mx - xk)) / 2), "X");

        refresh ();
        usleep (30000);

    }
    return 0;
}

