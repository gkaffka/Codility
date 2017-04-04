class Solution {
    public int solution(int N) {
        int binaryGap = 0;
        String binaryString = Integer.toBinaryString(N);
        char[] characters = binaryString.toCharArray();
        int j = 0;
        Character c;
        for (int i = 0; i < characters.length; i++) {
             c = characters[i];
            if (c.equals('0')) {
                j += 1;
            }
    
            if (c.equals('1')) {
                if (j > binaryGap ){
                    binaryGap = j;
                }
                j = 0;
            }
    
        }
        return binaryGap;
    }
}
