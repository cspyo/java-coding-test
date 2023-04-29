// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java

package programmers;

import java.util.*;

class Solution {
    static private Queue<Integer> prog;
    static private Queue<Integer> spd;
    static private int days;
    
    public int[] solution(int[] progresses, int[] speeds) {
        prog = new LinkedList<>();
        spd = new LinkedList<>();
               
        for (int item : progresses) {
            prog.add(item);
        }
        for (int item : speeds) {
            spd.add(item);
        }
        
        List<Integer> result = new ArrayList<>();
        days = 1;
        while (!prog.isEmpty()) {
            if (readyToRelease()) {
                int count = 0;
                while (!prog.isEmpty() && readyToRelease()) {
                    count +=1 ;
                    prog.poll();
                    spd.poll();
                }
                result.add(count);
                count = 0;
            }    
            days++;
        }
        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    static private boolean readyToRelease() {
        return prog.peek() + (spd.peek() * days) >= 100;
    }
}
