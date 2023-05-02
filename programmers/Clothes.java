package programmers;
// 의상
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
// 해시

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String clothType = cloth[1];
            map.put(clothType, map.getOrDefault(clothType, 1) +1);
        }
        
        int answer = 1;
        for (int value : map.values()) {
            answer *= value;
        }
        
        return answer-1;
    }
}