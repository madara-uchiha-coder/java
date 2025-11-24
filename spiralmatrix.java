import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;

        while(t <= b && l <= r) {
            for(int i = l; i <= r; i++) {
                list.add(matrix[t][i]);
            }
            t++;
            for(int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;
            if(t <= b) {
                for(int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
            }
            if(l <= r) {
                for(int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }

        return list;
    }
}