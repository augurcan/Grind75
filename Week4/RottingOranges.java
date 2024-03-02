package Week4;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int [][]visited= grid;
        Queue <int[]> queue = new LinkedList<>();
        int countFreshOrange=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(visited[i][j]==2) queue.add(new int[] {i,j});
                if(visited[i][j]==1) countFreshOrange++;
            }
        }
        if(countFreshOrange==0) return 0;
        if(queue.isEmpty()) return -1;
        int minutes=-1;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- >0){
            int[] cell = queue.poll();
            int x= cell[0];
            int y= cell[1];
                for(int[] direction: directions){
                    int i= x+direction[0];
                    int j= y+direction[1];
                    if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && visited[i][j] == 1){
                        visited[i][j]=2;
                        countFreshOrange--;
                        queue.add(new int[]{i,j});
                        }
                    }
            }
            minutes++;
        }
        if(countFreshOrange==0) return minutes;
        return-1;
    }
}
