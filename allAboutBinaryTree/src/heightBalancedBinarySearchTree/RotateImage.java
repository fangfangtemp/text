package heightBalancedBinarySearchTree;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                
            	int temp = 0;
            	temp = matrix[i][j];
            	matrix[i][j] = matrix[j][i];
            	matrix[j][i] = temp;
            }
        }
       
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length / 2; j++){
            	int temp = 0;
            	temp = matrix[i][j];
            	matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
            	matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }
    }
   
    public static void main(String[] args){
    	int[][] image = new int[2][2];
    	image[0][0] = 1;
    	image[0][1] = 2;
    	image[1][0] = 3;
    	image[1][1] = 4;
    	
    	rotate(image);
    	for(int i = 0; i < image.length; i++){
    		for(int j = 0; j < image[0].length; j++){
    			System.out.print(" "+ image[i][j]);
    		}
    	}
    }
}
