package programmers;
// 단어 변환
// https://school.programmers.co.kr/learn/courses/30/lessons/43163
// 백트래킹

class Solution {
    public static boolean[] visited;
    public static int answer;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = Integer.MAX_VALUE;
        backTracking(begin, target, 0, words);
        
        if (answer == Integer.MAX_VALUE) return 0;
        return answer;
    }
    
    public static void backTracking(String nowWord, String target, int cnt, String[] words) {
        if (nowWord.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }
        
        // 모든 단어들 중 아직 사용되지 않았으며, 한자리 빼고 다 같은 문자를 골라서 백트래킹
        for (int i=0; i<words.length; i++) {
            if (!visited[i] && check(nowWord, words[i])) {
                visited[i] = true;
                backTracking(words[i], target, cnt+1, words);
                visited[i] = false;
            }
        }
    }
    
    // 한 자리 빼고 같은 문자인지 체크
    public static boolean check(String nowWord, String nextWord) {
        int count = 0;
        
        for (int i=0; i<nowWord.length(); i++) {
            if(nowWord.charAt(i) == nextWord.charAt(i)) {
                count += 1;
            }
        }
        
        if (count == nowWord.length() -1) return true;
        else return false;
    }
}
