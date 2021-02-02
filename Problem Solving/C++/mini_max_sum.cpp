#include<bits/stdc++.h>
using namespace std;
#define int long long
signed main()
{
    int arr[5], sum;
    vector<int> arr_sum;
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
        arr_sum.push_back(sum);
    }
    cout << *min_element(arr_sum.begin(), arr_sum.end()) << " " << *max_element(arr_sum.begin(), arr_sum.end());
    return 0;
}