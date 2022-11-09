import java.util.*;

public class DFS_BFS {
   int x;
    LinkedList<Integer> adj[];
    Queue<Integer> queue;
    boolean visited[]=new boolean[x];
    DFS_BFS(int x)
     {
         this.x=x;
         adj=new LinkedList[x];
         for(int i=0;i<x;i++) {
             adj[i] = new LinkedList<>();
         }
         queue = new LinkedList<Integer>();
     }


    public void DFS(int root)
     {
         Stack<Integer> stc=new Stack<>();
         boolean visited[]=new boolean[x];
         stc.push(root);
         int a=0;
         while(!stc.empty())
         {
             root=stc.peek();
             stc.pop();
             if(visited[root]==false)
             {
                 System.out.print(root+" ");
                 visited[root]=true;
             }
             for(int j=0;j<adj[root].size();j++)
             {
                     a=adj[root].get(j);
                     if(!visited[a])
                     {
                         stc.push(a);

                     }
             }
             }
         }



    public void BFS(int root)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        boolean arr[]=new boolean[x];
        arr[root]=true;
        queue.add(root);
        for(int i=0;i<x;i++)
        {
            int n=queue.poll();
            System.out.print(n+" " );

            for(int j=0;j<adj[i].size();j++)
            {
                int a=adj[i].get(j);
                if(!arr[a]) {
                    arr[a]=true;
                    queue.add(a);
                }
                }
        }

    }
     public void add(int s,int d)
     {
         adj[s].add(d);
         adj[d].add(s);
     }

     public void neighbors(int vertex)
     {
         System.out.print("neighbors of "+vertex+" are: ");
         for(int i=0;i<x;i++)
         {
             if(i==vertex)
             {
                 System.out.println(adj[i]);
             }
         }
     }

     public  void print()
     {
                for(int i=0;i<x;i++)
                {
                          if(adj[i].size()>0)
                          {
                              System.out.print("Vertex "+i+" connected to: ");
                           for(int j=0;j<adj[i].size();j++)
                           {
                               System.out.print(adj[i].get(j)+" ");
                           }
                              System.out.println();

                          }
                }
     }




    public static void main(String[] args) {
       // System.out.println("Enter Number of vertex ");
        Scanner sc=new Scanner(System.in);
      //  int y=sc.nextInt();
        DFS_BFS prt=new DFS_BFS(6);
        prt.add(0, 1);
        prt.add(0, 2);
        prt.add(0, 3);
        prt.add(2, 4);
        prt.add(2, 5);

       ;
         //prt.neighbors(2);
        System.out.println("BFS");
        prt.BFS(0);
        System.out.println();
        System.out.println("DFS");
        prt.DFS(0);
        System.out.println();
        prt.print();




    }
//        ArrayList<LinkedList<Integer>> as=new ArrayList<LinkedList<Integer>>(5);
//
//    }
    //Queue<Integer> queue = new LinkedList<Integer>();
//    int arr[]=new int[5];
//    ArrayList<Integer> srr[]=new ArrayList[5];
//    ArrayList<Integer> a=new ArrayList<Integer>();
//    ArrayList<LinkedList<Integer>> as=new ArrayList<LinkedList<Integer>>(5);
//    ArrayList<ArrayList<Integer>> aofa=new ArrayList<ArrayList<Integer>>(6);
//    ArrayList<ArrayList<Integer> > ad = new ArrayList<ArrayList<Integer> >(5);
}
