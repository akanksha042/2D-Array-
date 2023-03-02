public class DiagonalSum {

    public static int printD(int [][]matrix){
        int sum=0;
        //bruteforce
        //O(n^2) 
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0 ; j<matrix[0].length; j++){

        //         //primary diagonal
        //         if(i==j){
        //             sum+= matrix[i][j];
        //         }
        //         //secondary diagonal
        //         else if(i+j == matrix.length-1){
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //pd
            sum+= matrix[i][i];
            //sd
            if(i != matrix.length-i-1)
                sum+= matrix[i][matrix.length-i-1];
        }

        return sum;
    }
    public static void main(String args[]){
        int matrix[] [] ={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};

                       // PrintSpiral(matrix);
                        System.out.println(printD(matrix));
    }

    
}
