#include<iostream>
using namespace std;
int main()
{
    int n, i, plus, minus, zero;
    plus = minus = zero = 0;
    cin >> n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin >> arr[i];
        if(arr[i] < 0)
            minus++;
        else if(arr[i] > 0)
            plus++;
        else 
            zero++;
    }
    printf("%.6f\n%.6f\n%.6f", (float)plus/n, (float)minus/n, (float)zero/n);
    return 0;
}