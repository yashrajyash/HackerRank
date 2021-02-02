import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr_sum = new ArrayList<>();
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<5; i++) {
            int sum = 0;
             for(int j=0; j<5; j++) {
                if(j == i)
                    continue;
                sum += arr[j];
            }
            arr_sum.add(sum);
        }
        Collection.sort(arr_sum);
        System.out.println(arr_sum.get(0) + " " + arr_sum.get(arr_sum.size()-1));
    }
}