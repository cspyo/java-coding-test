package programmers;
// 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 해시

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();
        String answer = "";
        
        for (String person : completion) {
            hashMap.computeIfPresent(person, (key, value)->value+1);
            hashMap.computeIfAbsent(person, key->1);
        }
        
        for (String person : participant) {
            if (hashMap.containsKey(person)) {
                if(hashMap.get(person) == 1) 
                    hashMap.remove(person);
                else 
                    hashMap.computeIfPresent(person, ((key, value) -> value-1));
            } else {
                answer = person;
                return answer;
            }
        }
        return answer;
    }
}
