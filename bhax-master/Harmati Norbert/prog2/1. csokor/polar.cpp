#include <iostream>
#include <math.h>
using namespace std;


class polar{
public:
bool nincstarolt = true;
double kovi();
double tarolt;
};

double polar::kovi()
{
if(nincstarolt)
{
double u1,u2,v1,v2,w;
do { u1 = ((double) rand() / (RAND_MAX));
    u2 = ((double) rand() / (RAND_MAX));
    v1 = 2*u1 -1;
    v2 = 2*u2-1;
w = v1*v1+v2*v2;
}
while(w>1);

double r = sqrt((-2*log(w))/w);
tarolt = r* v2;
    nincstarolt = !nincstarolt;
    return r* v1;
}
else
{
    nincstarolt = !nincstarolt;
    return tarolt;
}

}

int main()
{
    polar g ;
    for (int i=0; i<10;i++)
        cout << g.kovi() << endl;
}
