#include<iostream>
using namespace std;
int main()
{
    int n, l = 0 , r = 0, ans;
    cin >> n;
    int arr[n][n];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            cin >> arr[i][j];
        }
        l += arr[i][i];
        r += arr[i][n-i-1];
    }
    ans = (l > r) ? (l-r) : (r-l);
    cout << ans;
    return 0;
}