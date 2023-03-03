package DvoinoiMassiv;

import java.util.Scanner;

public class dvoinoi14 {
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
        int index_max = 0;
        int index_max1 = 0;
        int min = arr[0][0];
        int index_min = 0;
        int index_min1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index_max = i;
                    index_max1 = j;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    index_min = i;
                    index_min1 = j;
                }
            }
        }
        int t = arr[index_max][index_max1];
        arr[index_max][index_max1] = arr[index_min][index_min1];
        arr[index_min][index_min1] = t;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}


