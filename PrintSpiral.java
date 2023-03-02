public class PrintSpiral {
    public static void PrintSpiral(int matrix[][]){
        int StartRow = 0;
        int EndRow = matrix.length-1;
        int StartCol = 0;
        int EndCol = matrix[0].length-1;
// in while loop we use <= equal to because we have to deal with odd number matrix too
//so agar sr<er and ec<ec is case ke liye our odd couldn't able to run so we have to 
//make sure ki last wala 
        while(StartRow<=EndRow && StartCol<= EndCol){
            //top boundary
            for(int j=StartCol; j<=EndCol ; j++){
                System.out.print(matrix[StartRow][j]+ " ");
            }
            //right boundary
            for(int i=StartRow+1 ; i<=EndRow ; i++){
                System.out.print(matrix[i][EndCol]+ " ");
                
            }

            //bottom
            for(int j=EndCol-1 ; j>=StartCol; j--){
                if(StartRow == EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][j]+ " ");
            }
            //left
            for(int i=EndRow-1 ; i>=StartRow+1;i--){
                if(StartCol == EndCol){
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }

            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;



        }
        System.out.println();

    }
    public static void main(String args[]){
        int matrix[] [] ={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}};

                        PrintSpiral(matrix);
    }
    
}
