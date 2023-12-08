public class Merge2sortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int n= arr1.length, i;
        int[] arr2={4,5,6};
        int m= arr2.length;
        int p=n+m;
        int[] mergedarr= new int[p];
        for(i=0; i<n; i++){
            mergedarr[i]=arr1[i];
        }
        int k=i;
        for( i=0; i<m; i++){
            mergedarr[k++]=arr2[i];
        }
        for(i=0; i<k; i++){
            System.out.print(mergedarr[i]+" ");
        }
        System.out.println();
//        for(i=0; i<k-1; i++){
//            for(int j=i+1; j<k; j++){
//                if(mergedarr[i]>mergedarr[j]){
//                    int temp=mergedarr[i];
//                    mergedarr[i]=mergedarr[j];
//                    mergedarr[j]=temp;
//                }
//            }
//        }
//        for(i=0; i<k; i++){
//            System.out.print(mergedarr[i]+" ");
//        }
    }
}
