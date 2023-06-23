//import java.util.ArrayList;
//import java.util.List;
//
//public class LT733 {
//    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
////        List<List<Integer>>l1= new ArrayList<>();
//        List<int[][]>l2=new ArrayList<>();
//        int a=Integer.MIN_VALUE;
//        int[][] faltu={{sr},{sc}};
//        l2.add(faltu);
//        while(a!=l2.size()){
//            int max=image[sr][sc];
//            for(int k=0;k<l2.size();k++){
//                for(int i=0;i<image.length;i++){
//                    int[][]arr=new int[1][1];
//                    for(int j=0;j<image[0].length;j++){
//                        if( i>0){
//                            if(l2.get(k)[i-1][j]==color){
//                                arr={{i-1},{j}};
//                            }
//                        }
//                    }
//                    if(!l2.contains(arr)){
//                        l2.add(arr);
//                    }
//                }
//            }
//            a=l2.size();
//        }
//    }
//}
