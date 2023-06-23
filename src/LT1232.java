public class LT1232 {
    public static boolean checkStraightLine(int[][] c) {
        int m=1;
        float k=0;
        try {
            m = (c[0][1] - c[1][1]) / (c[0][0] - c[1][0]);
            if(Math.abs((c[0][0] - c[1][0]))>Math.abs(c[0][1] - c[1][1])){
                k=(float)(c[0][1] - c[1][1]) / (c[0][0] - c[1][0]);
//                System.out.println(k);
            }
        }
        catch (Exception e){
            for(int i=0;i<c.length-1;i++){
//                System.out.println("Try");
                if(c[i][0]!=c[i+1][0]){
                    return false;
                }
            }
            return true;
        }
        for(int i=0;i<c.length;i++){
//            System.out.println("Non try");
            if(k!=0){
                if((float)(c[i][1]-c[0][1])!=k*(float)(c[i][0]-c[0][0])){
                    return false;
                }
            }
            if((c[i][1]-c[0][1])!=m*(c[i][0]-c[0][0]) && k==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] c1={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        int[][] c2={{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        int[][] c3={{0,0},{0,1},{0,-1}};
        int[][] c4={{2,1},{4,2},{6,3}};
        int[][] c5={{2,4},{2,5},{2,8}};
        System.out.println(checkStraightLine(c1));
        System.out.println(checkStraightLine(c2));
        System.out.println(checkStraightLine(c3));
        System.out.println(checkStraightLine(c4));
        System.out.println(checkStraightLine(c5));
    }
}
