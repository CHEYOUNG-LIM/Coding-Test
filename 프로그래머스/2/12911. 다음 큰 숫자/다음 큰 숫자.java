class Solution {
    public int solution(int n) {
        int count = countOnes(n);
        
        while (true) {
            n++;
            if (count == countOnes(n)) {
                return n;
            }
        }
    }

    private int countOnes(int number) {
        String binaryString = Integer.toBinaryString(number);
        int count = 0;
        
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        
        return count;
    }
}