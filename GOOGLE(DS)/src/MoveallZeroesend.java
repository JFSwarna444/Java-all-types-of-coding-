public class MoveallZeroesend {
    static void MoveZero(int[] arr, int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[count++]= arr[i];
            }

        }for(int i=0; i<n; i++)
        while(count<n && arr[i]==0){
            arr[count++]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 8, 0, 2, 0, 1, 13, 0};
        int n= arr.length;
        MoveZero(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
