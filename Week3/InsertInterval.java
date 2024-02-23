package Week3;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result= new ArrayList();
        int i= 0, n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]) result.add(intervals[i++]);
        int[] nInterval=newInterval;
        while(i<n&& intervals[i][0]<=newInterval[1]){
            nInterval[0]=Math.min(nInterval[0], intervals[i][0]);
            nInterval[1]=Math.max(nInterval[1],intervals[i++][1]);
        }
        result.add(nInterval);
        while(i<n) result.add(intervals[i++]);
        return result.toArray(new int[result.size()][2]);
    }
}