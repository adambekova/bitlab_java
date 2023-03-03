package DvoinoiMassiv;

import java.util.Scanner;

public class dvoinoi15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();
        int x=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]%k == 0) {
                    x=arr[i][j]/k;
                    arr[i][j]=x;
                }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }







