import java.util.Scanner;

class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int plus, minus, zero;
        plus = minus = zero = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<0)
                minus++;
            else if(arr[i]>0)
                plus++;
            else 
                zero++;
        }
        System.out.printf("%.6f\n%.6f\n%.6f", (float)plus/n, (float)minus/n, (float)zero/n);
        sc.close();
    }
}