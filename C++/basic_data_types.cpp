#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    int int_val;
    long long_val;
    char char_val;
    float float_val;
    double double_val;
    scanf("%d %ld %c %f %lf", &int_val, &long_val, &char_val, &float_val, &double_val);
    printf("%d\n%ld\n%c\n%.3f\n%.9lf", int_val, long_val, char_val, float_val, double_val);
    return 0;
}