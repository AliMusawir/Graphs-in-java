class Neighbors
{
    int arr[][];
    int x;
    Neighbors(int x)
    {
        this.x=x;
        arr=new int[x][x];

    }
    public void add(int x,int y)
    {
             arr[x][y]=1;
             arr[y][x]=1;

    }

    public void neighbors(int vertex)
    {
        System.out.print("neighbors of "+vertex+" are: ");
        for (int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++) {
                if (i == vertex && arr[i][j]==1) {
                    System.out.print(j+ " ");
                }
            }
        }

    }
    public void print()
    {
        for(int i=0;i<x;i++)
        {
            System.out.print("vertex "+i+" is connect to: " );
            for(int j=0;j<x;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print(j+" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Neighbors g=new Neighbors(5);
        g.add(0,1);
        g.add(0,2);
        g.add(0,3);
        g.add(0,4);
        g.add(1,2);
        g.add(1,3);
        g.add(1,4);
        g.add(2,3);
        g.add(2,4);
        g.add(3,4);
        g.neighbors(2);
        System.out.println();


        g.print();
    }

}