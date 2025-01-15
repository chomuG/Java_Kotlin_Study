import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BOJ2178 {
    static int m, n;
    static int[][] maze, visited;
    static int[] dx={0, 1, 0, -1}, dy={1, 0, -1, 0};

    static boolean isOutOfRange(int x, int y){
        return (x<1 || x>n || y<1 || y>m || maze[x][y]==0 || visited[x][y]==1);
    }

    static int BFS(){
        Queue<int[]> q = new LinkedList<int[]>();
        int ret=10000;
        q.add(new int[]{1, 1, 1});
        visited[1][1]=1;

        while(!q.isEmpty()){
            int[] tmp=q.poll();
            int curX=tmp[0], curY=tmp[1], curDist=tmp[2];

            if(curX==n && curY==m){
                ret=Math.min(ret, curDist);
                continue;
            }

            for(int i=0; i<4; ++i){
                int nextX=curX+dx[i], nextY=curY+dy[i];

                if(!isOutOfRange(nextX, nextY)){
                    visited[nextX][nextY]=1;
                    q.add(new int[]{nextX, nextY, curDist+1});
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        maze= new int[n+1][m+1];
        visited= new int[n+1][m+1];

        sc.nextLine();

        for(int i=1; i<=n; ++i){
            String input=sc.nextLine();

            for(int j=0; j<m; ++j){
                maze[i][j+1]=input.charAt(j)-'0';
            }
        }

        System.out.println(BFS());
    }
}
/* 기억해야 할 점
* 1. input값을 line별로 공백없이 입력 받는 것
* 2. java에서 Queue를 사용하는 법
* 3. nextInt 이후 sc.nextLine();로 buffer 값 빼주기
* */
