import java.util.Scanner;
class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
