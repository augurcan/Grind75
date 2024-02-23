package Week3;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        if(mat==null || mat.length==0 || mat[0].length==0) return new int[0][0];
        int rows=mat.length;
        int cols=mat[0].length;
        int[][] result = new int[rows][cols];
        Queue<int[]> queue= new LinkedList<>();

        for(int i= 0; i<rows;i++)
            for(int j=0; j<cols;j++){
                if(mat[i][j]==0) queue.offer(new int[]{i,j,0});
                else result[i][j]= rows*cols;
            }
        
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x=current[0];
            int y=current[1];
            int distance=current[2];

            for(int [] direction: directions){
                int nx=x+direction[0];
                int ny=y+direction[1];
                if(nx>=0 &&nx< rows && ny>=0 &&ny<cols && result[nx][ny]>distance+1){
                    result[nx][ny]=distance+1;
                    queue.offer(new int[]{nx,ny,distance+1});
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] result = updateMatrix(matrix);

        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}