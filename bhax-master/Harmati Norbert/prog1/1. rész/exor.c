#include <stdio.h>

int main()
{

int a;
int b;
printf("Irj be 2 szamot: ");
scanf("%i", &a);
scanf("%i", &b);

a=a^b;
b=a^b;
a=a^b;

printf("%i\n", b);
printf("%i\n", a);
}
