public class SortingFor012 {
    public static void sort012(int a[],int n){
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zero++;
            }
            if(a[i]==1){
                one++;
            }
            if(a[i]==2){
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            a[i]=0;
        }
        for(int i=zero;i<one+zero;i++){
            a[i]=1;
        }
        for(int i=one+zero;i<two+one+zero;i++){
            a[i]=2;
        }
        printArray(a);
    }

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n1=5;
        int arr1[]={0,2,1,2,0};
        int n2=3;
        int arr2[]={0,1,0};
        sort012(arr1,n1);
        sort012(arr2,n2);
    }
}
