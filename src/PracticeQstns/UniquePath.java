package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 04/10/17.
 */
public class UniquePath {
    static int minCost(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m][n];

        tc[0][0] = 1;

        /* Initialize first column of total cost(tc) array */
        for (i = 1; i < m; i++)
            tc[i][0] =tc[i-1][0]+ 1;

        /* Initialize first row of tc array */
        for (j = 1; j < n; j++)
            tc[0][j] = tc[0][j-1]+1;

        /* Construct rest of the tc array */
        for (i = 1; i < m; i++)
            for (j = 1; j < n; j++)

                tc[i][j] =Math.min(tc[i-1][j-1], Math.min(tc[i-1][j], tc[i][j-1]))+1;
        return tc[m-1][n-1];
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3},{1,2,3}};
        int min_cost = minCost(cost,cost.length,cost[0].length);
        System.out.println("minimum cost to reach (2,1) = " + min_cost);
    }
}
