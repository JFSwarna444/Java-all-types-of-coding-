import java.util.Scanner;
                                     //this time complexicity 0(n^2)
public class Median2sortedarrsamesize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int n1= sc.nextInt();
        int[] arr1=new int[n1];
        int n2= sc.nextInt();
        int[] arr2=new int[n2];
        for(i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        for( i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        int p=n1+n2;
        int []mergearr=new int[p];
        for(i=0; i<n1; i++){
            mergearr[i]=arr1[i];
        }

        int k=i;
        for(i=0; i<n2; i++){
            mergearr[k++]=arr2[i];
        }
        for(i=0; i<k; i++){
            System.out.print(mergearr[i]+" ");   //merge 2 array anything i provide (sorted number or unsorted number)
        }
        System.out.println();
        //bubble sort
        for(i=0; i<k-1; i++){
            for(int j=i+1; j<k; j++){
                if(mergearr[i]>mergearr[j]){
                    int temp=mergearr[i];
                    mergearr[i]=mergearr[j];
                    mergearr[j]=temp;
                }
            }
        }
        for(i=0; i<k; i++){
            System.out.print(mergearr[i]+" ");    // now sorted two merge array
        }
        System.out.println();
        //find median
        if(k%2!=0){
            System.out.println((double) mergearr[k/2]);
        }

            System.out.println((double) (mergearr[(k-1)/2]+mergearr[k/2])/2.0);

    }
}
