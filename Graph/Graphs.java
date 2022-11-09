import java.util.LinkedList;
import java.util.Scanner;
class graphImpement{
    private LinkedList<Integer> adj[];
    graphImpement(int v)
    {
        adj=new LinkedList[v];
        for (int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }


    }
    public void insert(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
        System.out.print(adj[d]);
        System.out.print(adj[s]);
    }
}

public class Graphs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter v and e ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        graphImpement gi=new graphImpement(v);
        System.out.println("enter eges");
        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            gi.insert(s,d);
        }

    }
}
