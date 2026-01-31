package leetcode;
public class _73_Set_Matrix_zeroes {
        public void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m =matrix[0].length;

            int [] row = new int[n];
            int [] column = new int[m];
            for( int i =0;i<n;i++){
                for( int j =0;j<m;j++){
                   if( matrix[i][j]==0){
                       row[i]=1;
                       column[i]=1;
                   }
                }
            }
            
            for( int i =0;i<n ; i++){
                for( int j = 0;j<m;j++){
                    if( row[i]==1 ||column[j]==1){
                        matrix[i][j]=0;
                    }
                }
            }
            display(matrix);
        }
        void display(int [][]matrix ){
            System.out.println();
            for(int i = 0;i<matrix.length;i++){
                for(int j =0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int [][]arr={{1,1,1},{1,0,1},{1,1,1}};
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j< arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            _73_Set_Matrix_zeroes obj = new _73_Set_Matrix_zeroes();
            obj.setZeroes(arr);
        }
    }

