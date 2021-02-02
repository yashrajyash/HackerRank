import java.util.Scanner;
class VeryBigSum {
    public static void main(String[] args) {
        long n, sum =0, temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        while(n-- > 0) {
            temp = sc.nextLong();
            sum += temp;
        }
        System.out.println(sum);
        sc.close();
    }
}