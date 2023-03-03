package DvoinoiMassiv;

import java.util.Scanner;

public class dvoinoi12 {
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
        int max = 0;
        int index=0;
        int index1=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index =i;
                    index1=j;
                }
            }
        }
            System.out.println(max+ " ");
        System.out.print(index + " "+ index1);
        }
    }

