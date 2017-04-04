// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length ==1) return A;
        int[] temp = new int[A.length];
            for(int i=0;i<A.length;i++) 
                temp[getNewArrayPosition(A.length, i, K%A.length)] = A[i]; 
            return temp;
    }

    private int getNewArrayPosition(int size, int i, int k) {
        if((i+k) >= size) {
            return (i+k) - size;    
        } else return i+k;
    }
}

