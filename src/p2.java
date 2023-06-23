public class p2 {
    static int funn(int a,int b){
        if(a>0){
            return a+funn(a-b+b-a,a+b-a-b);
        }
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(funn(2,5));
    }
}
