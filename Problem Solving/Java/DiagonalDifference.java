import java.util.Scanner;
class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0, r =0, n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
            l += arr[i][i];
            r += arr[i][n-i-1];
        }
        System.out.println(Math.abs(l-r));
        sc.close();
    }
}