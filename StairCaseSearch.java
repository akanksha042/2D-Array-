public class StairCaseSearch {

    public static boolean printFound(int [][]matrix, int target){
        int row=0;
        int col = matrix[0].length-1;
        //while loop depends on row bada hai yaa col
        //m>>>n O(m)
        //n>>m O(n)
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("found target at : (" + row + ","+ col + ")");
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

System.out.println("key not found");
        return false;
        
        
 
    }
    public static void main(String args[]){
        int matrix[] [] ={{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,26,82}};

                        int target = 15;
                       // PrintSpiral(matrix);
                        System.out.println(printFound(matrix, target));
    }
}

    

