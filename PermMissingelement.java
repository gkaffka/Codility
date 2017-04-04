

class Solution {
    public int solution(int[] A) {
        int b[] = new int[A.length+1];
        int ideal = 0 ; 
        int actual = 0 ;
        
        for (int i=0;i<A.length+1;i++) {
            b[i] = i+1;
            ideal += b[i];
            if(i<A.length)
		actual += A[i];   
        }    
 
        return ideal - actual;
    }
}
