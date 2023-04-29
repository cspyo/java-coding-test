package programmers;

import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder("");
        int n = number.length() - k;
        
        int start = 0;
        int end = number.length() - n + 1;
        while (start < number.length() && answer.length() != n) {
            int maxVal = -1;
            for (int i = start; i<end; i++) {
                int now = number.charAt(i) - '0';
                if (now > maxVal) {
                    maxVal = now;
                    start = i + 1;
                }
            }
            answer.append(Integer.toString(maxVal));
            end += 1;
        }
        return answer.toString();
    }
    
    
}