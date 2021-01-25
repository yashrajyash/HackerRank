import java.util.Scanner;
class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, alice[] = new int[3], bob[] = new int[3];
        for(int i=0; i<3; i++) {
            alice[i] = sc.nextInt();
        }
        for(int j=0; j<3; j++) {
            bob[j] = sc.nextInt();
        }
        for(int k=0; k<3; k++) {
            if (alice[k] > bob[k])
                a++;
            if (alice[k] < bob[k])
                b++;
        }
        System.out.println(a+" "+b);
        sc.close();
    }
}
