package PracticeQstns; /**
 * Created by Roshni Velluva Puthanidam on 6/30/16.
 */

import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        int x = 0;
        int y = 0;

        while (m > 0 && n > 0) {
            //if one row/column left, no circle can be formed
            if (m == 1) {
                for (int i = 0; i < n; i++) {
                    result.add(matrix[x][y++]);
                }
                break;
            } else if (n == 1) {
                for (int i = 0; i < m; i++) {
                    result.add(matrix[x++][y]);
                }
                break;
            }

            //below, process a circle

            //top - move right
            for (int i = 0; i < n - 1; i++) {
                result.add(matrix[x][y++]);
            }

            //right - move down
            for (int i = 0; i < m - 1; i++) {
                result.add(matrix[x++][y]);
            }

            //bottom - move left
            for (int i = 0; i < n - 1; i++) {
                result.add(matrix[x][y--]);
            }

            //left - move up
            for (int i = 0; i < m - 1; i++) {
                result.add(matrix[x--][y]);
            }

            x++;
            y++;
            m = m - 2;
            n = n - 2;
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix m = new SpiralMatrix();
        SpiralMatrix s = m;

        int[][] matrix =
                {{1, 2, 3, 10},
                        {4, 5, 6, 11},
                        {7, 8, 9, 12}, {13, 14, 15, 16}};

        ArrayList<Integer> result = s.spiralOrder(matrix);//m.spiralOrder(matrix);
        System.out.println(result);
    }
}
