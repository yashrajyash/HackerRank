#include<iostream>
using namespace std;
int main()
{
    int alice[3], bob[3], a = 0, b = 0;
    for(int i=0; i<3; i++)
        cin >> alice[i];
    for(int j=0; j<3; j++)
        cin >> bob[j];
    for(int k=0; k<3; k++)
    {
        if (alice[k] > bob[k])
            a++;
        if (alice[k] < bob[k])
            b++;
    }
    cout << a << " " << b;
    return 0;
}