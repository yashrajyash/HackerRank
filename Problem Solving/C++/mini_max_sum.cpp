#include<bits/stdc++.h>
using namespace std;
#define int long long
signed main()
{
    int arr[5], sum, max, min;
    for(int i=0; i<5; i++)
        cin >> arr[i];
    for(int i=0; i<5; i++)
    {
        sum = 0;
        for(int j=0; j<5; j++)
        {
            if(j==i)
                continue;
            sum += arr[j];
        }
        if(i == 0)
        {
            max = sum;
            min = sum;
        }
        max = (max < sum) ? sum : max;
        min = (min > sum) ? sum : min;
    }
    cout << min << " " << max;
    return 0;
}