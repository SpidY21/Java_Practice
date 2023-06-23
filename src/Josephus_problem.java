public class Josephus_problem {
    public static int solution(int n,int k){
        if(n==1){
            return n;
        }
        return solution((n-1),k)+((k-1)%n)+1;
    }
    public static void main(String[] args) {
        System.out.println(solution(3,2));
    }
}
