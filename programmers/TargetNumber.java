package programmers;
// 타겟넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java

class Solution {
    public static int[] numbers;
    public static int target=0;
    public static int n=0;
    public static int answer=0;
    
    public static void dfs(int cnt, int result) {
        if (cnt == n) {
            if (result == target)
                answer+=1; 
        }
        else {
            dfs(cnt+1, result+numbers[cnt]);
            dfs(cnt+1, result-numbers[cnt]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.n = numbers.length;
        this.target = target;
        this.answer = 0;
        
        dfs(0, 0);
        
        return answer;
    }
}