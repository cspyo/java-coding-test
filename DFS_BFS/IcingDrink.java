package DFS_BFS;

import java.util.Scanner;

public class IcingDrink {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int  y) {
        if (x<0 || x>=n || y<0 || y>=m || graph[x][y]==1) return false;
        graph[x][y] = 1;
        dfs(x-1, y);
        dfs(x+1, y);
        dfs(x, y-1);
        dfs(x, y+1);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        for (int i=0; i<n; i++) {
            String str = sc.nextLine();
            for (int j=0; j<m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(dfs(i,j)) answer++;
            }
        }
        System.out.println(answer);
    }
    
}
