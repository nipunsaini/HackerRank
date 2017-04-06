package domain.ds.arrays;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        d %= n;
        for(int j = 0; j < n; j++) {
            System.out.print(array[d] + " ");
            d++;
            if (d == n) d %= n;
        }
    }

}
