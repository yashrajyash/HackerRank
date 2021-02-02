#include<iostream>
using namespace std;
typedef long long ll;
int main()
{
    ll n, sum = 0, temp;
    cin >> n;
    while(n--)
    {
        cin >> temp;
        sum += temp;
    }
    cout << sum;
    return 0;
}