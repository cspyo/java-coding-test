package TeamNote;

public class RotateMatrix {
    public static int[][] rotate(int[][] map) {
        int n = map.length;
        int m = map[0].length;
        
        int[][] rotatedMap = new int[m][n];
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                rotatedMap[i][j] = map[n - 1 - j][i];
        return rotatedMap;
    }
}
