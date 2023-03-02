import java.util.*;


public class Creation{
    public static void Search(int[][]matrices, int target){
        
        for(int i=0; i<matrices.length; i++){
            for(int j=0 ; j<matrices[0].length ;j++){
                if (matrices[i][j] == target)
                System.out.print("target present at " + i + " "  + j);
            }

    }
}
    public static void main(String args[]){
        int matrices [][]= new int[3][3];
        int n = 3; //row
        int m = 3; //col

        //or we have alternative to find n and m
        //int n = matrices.length
        //int m = matrices[0].length;

        Scanner sc = new Scanner(System.in);
        
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
        System.out.print("Which Key you want to search : ");
        int target = sc.nextInt();

        Search(matrices,target);


    
}
}