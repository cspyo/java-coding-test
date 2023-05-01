package programmers;
// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
    public int[] solution(int brown, int yellow) {
        int n = brown+yellow;
        int x=0, y=0;
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                x = Math.max(i, yellow/i);
                y = Math.min(i, yellow/i);
                
                if((x+2)*(y+2) == n) break;
            }
        }
        
        int[] answer = {x+2, y+2};
        
        return answer;
    }
}
