import java.util.*;


public class LargestAndSmallestInMatrix{
    public static void Find(int[][]matrices, int maximum, int minium){
        
        for(int i=0; i<matrices.length; i++){
            for(int j=0 ; j<matrices[0].length ;j++){
                if (matrices[i][j] > maximum)
                maximum = matrices[i][j];

                if(matrices[i][j] < minium){
                    minium = matrices[i][j];
                }
            }
           
           

    }
    System.out.println("maximum element in matrix is : " + maximum);
    System.out.println("minimum element in matrix is : " + minium);
}
    public static void main(String args[]){
        int matrices [][]= new int[3][3];
        int n = 3; //row
        int m = 3; //col

        //or we have alternative to find n and m
        //int n = matrices.length
        //int m = matrices[0].length;

        Scanner sc = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minium = Integer.MAX_VALUE;
        
        for(int i=0; i<n;i++){
            for(int j=0 ; j<m;j++){
                matrices[i][j] = sc.nextInt();
            }

        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0 ; j<m ;j++){
                System.out.print(matrices[i][j]+ " ");
            }
            System.out.println();
        }
        

        Find(matrices,maximum,minium);


    
}
}