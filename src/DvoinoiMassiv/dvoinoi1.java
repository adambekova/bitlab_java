package DvoinoiMassiv;

import java.util.Scanner;

public class dvoinoi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = {
            {12, 5, 7, 6},
                {4, 0, 2, 7},
                {9, 1, 3, 2},
                {10, -2, 4, 6}
        };

        System.out.println(arr[n][m]);
    }
}



