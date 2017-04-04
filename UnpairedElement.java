// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
      Arrays.sort(A);
       for(int i = 0;i< A.length; i=i+2) { 
           if(i+1 >= A.length) return A[i];
           if(A[i] != A[i+1]) return A[i];
       }
       return 0;
    }
}
