import java.util.Scanner;

public class SetMatrixZeroes {
    public static void setzeroes(int[][] mat){
        int col0=1, rows= mat.length, cols=mat.length;
        for(int i=0; i<rows; i++){
            if(mat[i][0]==0) col0 = 0;
            for(int j=1; j<cols; j++)
                if(mat[i][j]==0)
                    mat[i][0]=mat[0][j]=0;

            }

        for(int i=rows-1; i>=0; i--){
            for(int j=cols-1; j>=1; j--){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
                if(col0==0){
                    mat[i][0]=0;
                }
            }
        }
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] mat=new int[3][3];
        int i,j=0;
        for(i=0; i<3;i++){
            for(j=0; j<3; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        setzeroes(mat);

    }
}







