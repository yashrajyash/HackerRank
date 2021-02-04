#include<iostream>
using namespace std;
#define int long long
signed main()
{
    int n, num, max, count = 0;
    cin >> n;
    for(int i=0; i<n; i++)
    {
        cin >> num;
        if(i == 0) max = num;
        if(max < num)
        {
            count = 0;
            max = num;
        }
        if(max == num) count++;
    }
    cout << count;
    return 0;
}