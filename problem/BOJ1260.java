import java.util.*;

public class BOJ1260 {
    static int n, m, v;
    static int[] isVisitedDFS, isVisitedBFS;
    static ArrayList<Integer>[] adj;


    static void DFS(int curNode){
        isVisitedDFS[curNode]=1;
        System.out.print(curNode+" ");
        for(int i=0; i<adj[curNode].size(); ++i){
            int next=adj[curNode].get(i);
            if(isVisitedDFS[next]==0){
                DFS(next);
            }
        }
    }


    static void BFS(int curNode){
        Queue<Integer> q = new LinkedList<>();
        q.add(curNode);

        while(!q.isEmpty()){
            int node= q.poll();
            isVisitedBFS[node]=1;
            System.out.print(node+" ");

            for(int i=0; i<adj[node].size(); ++i){
                int next=adj[node].get(i);
                if(isVisitedBFS[next]==0){
                    q.add(next);
                    isVisitedBFS[next]=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        v=sc.nextInt();
        adj=new ArrayList[n+1];
        isVisitedDFS= new int[n+1];
        isVisitedBFS= new int[n+1];
        for(int i=1; i<=n; ++i){
            adj[i]= new ArrayList<>();
        }

        for(int i=0; i<m; ++i){
            int s, e;
            s=sc.nextInt();
            e=sc.nextInt();
            adj[s].add(e);
            adj[e].add(s);
        }

        for(int i=1; i<=n; ++i){
            Collections.sort(adj[i]);
        }
        DFS(v);
        System.out.println();
        BFS(v);
    }
}
