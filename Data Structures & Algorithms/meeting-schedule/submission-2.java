/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
           
          intervals.sort(Comparator.comparingInt(i -> i.start));
           
           int start =-1;
          int end=-1;

          boolean can=true;

          for(Interval i: intervals){
            if(start== -1 && end ==-1){
                start=i.start;
                end=i.end;
                continue;
            }else{
                if(i.start<end){
                can=false;
                return can;
                }
                 start = i.start;
                 end = i.end;
            }
          }
        return can;
    } 
}
