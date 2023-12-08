import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DetectCyclegraph {
   private int n;
   private List<List<Integer>>adj;
   public DetectCyclegraph(){
       this.n=n;
       adj=new ArrayList<>(n);
       for(int i=0; i<n; i++)
           adj.add(new LinkedList<>());
   }
    private boolean iscyclic(int i, boolean[] visited, boolean[] recstack){
        if(recstack[i])return true;
        if(visited[i])
            return false;
        visited[i]=true;
        recstack[i]=true;
        List<Integer> child =adj.get(i);

        for(Integer p:child){
            if(iscyclic(p,visited,recstack))
                return true;
        }
        recstack[i]=false;
        return false;
    }
    private void create_graph(int source, int dest){
        adj.get(source).add(dest);
    }
    private boolean cyclic(){
        boolean[] visited =new boolean[n];
        boolean[] recstack =new boolean[n];
        for(int i=0; i<n; i++){
            if(iscyclic(i,visited,recstack));
            return true;
        }
        return false;
    }
     static void create_graph(){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int graph[][] = new int[n][n];

        int source,dest,i,j;
        for( i=0; i<n; i++){
            System.out.println("how many source");
            source= sc.nextInt();
            dest=sc.nextInt();
            for(i=0; i<=source; i++){
                for(j=i+1; j<=dest; j++){
                   //printf("%d-%d :",source[i]);
                   graph[i][j]= sc.nextInt();
                }
            }
        }
    }
    public static void main(String[] args) {
        DetectCyclegraph cy = new DetectCyclegraph();
        create_graph();
        if(cy.cyclic())
        System.out.println("graph is cyclic");
        else System.out.println("graph isn't cyclic");
    }
}
