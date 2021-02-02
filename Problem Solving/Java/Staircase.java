import java.util.Scanner;

class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j >= (n+1-i) && j <= n) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
