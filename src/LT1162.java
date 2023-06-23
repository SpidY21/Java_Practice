public class LT1162 {
    public static int maxDistance(int[][] grid) {
        int n1=0;
        int n0=0;
        int n=grid.length;
        int[][] ones=new int[n*n][2];
        int[][] zeros=new int[n*n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ones[i][0]=i;
                    ones[i][1]=j;
                    n1++;
                }
                if(grid[i][j]==0){
                    zeros[i][0] = i;
                    zeros[i][1] = j;
                    n0++;
                }
            }
        }
        if(n0==0 || n1==0){
            return -1;
        }
        int max=0;
        for(int i=0;i<n1;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n0;j++){
                int dist=Math.abs(ones[i][0]-zeros[j][0])+Math.abs(ones[i][1]-zeros[j][1]);
                min=Math.min(min,dist);
            }
            max=Math.max(max,min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a1={{1,0,1},{0,0,0},{1,0,1}};
        int[][] a2={{1,0,0},{0,0,0},{0,0,0}};
        int[][] a3={{0,0,1,1,1},{0,1,1,0,0},{0,0,1,1,0},{1,0,0,0,0},{1,1,0,0,1}};
        int[][] a4={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        System.out.println(maxDistance(a1));
        System.out.println(maxDistance(a2));
        System.out.println(maxDistance(a3));
        System.out.println(maxDistance(a4));
    }
}
