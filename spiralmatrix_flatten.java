class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // the spiral order is achieved by using 4 pointers.
        int m= matrix.length;
        int n= matrix[0].length;
        List<Integer> result = new ArrayList<>();
        // here the pointers itself are the positions of the rows and columns 
          int left = 0;

        int top = 0;

        int right = matrix[0].length - 1;

        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom){

            // Top row 

            for(int i = left; i <= right; i++){

                result.add(matrix[top][i]);

            }

            top++;


            // right column 

            for(int i = top; i <= bottom; i++){

                result.add(matrix[i][right]);

            }

            right--;


            if(top <= bottom){

               for(int i = right; i >= left; i--){

                    result.add(matrix[bottom][i]);

                } 

            }

            bottom--;

            if(left <= right){

               for(int i = bottom; i >= top; i--){

                    result.add(matrix[i][left]);

                }  

            }

            left++;

        }

        return result;

    }

}
    
