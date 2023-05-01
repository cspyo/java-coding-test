package BOJ;
// 시각
// https://www.acmicpc.net/problem/18312

import java.util.Scanner;

public class TheTime18312 {

    public static boolean check(int h, int m, int s, int k) {
        if (h%10==k || m/10==k || m%10==k || s/10==k || s%10==k){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int k = scan.nextInt();
		int answer=0;

        // 문자열을 이용한 풀이
		// for(int i=0;i<=n;i++){
		// 	for(int j=0;j<60;j++){
		// 		for(int a=0;a<60;a++){
		// 			String tmpStr="";
		// 			tmpStr+=i;
		// 			tmpStr+=j;
		// 			tmpStr+=a;
		// 			if(tmpStr.contains(String.valueOf(k))){
		// 				answer++;
		// 			}
		// 		}   
		// 	}
		// }

        for (int i=0; i<=n; i++) {
            for (int j=0; j<60; j++) {
                for (int a=0; a<60; a++) {
                    if(check(i, j, a, k)) {
                        answer++;
                    }
                }
            }
        }
        
		System.out.print(answer);
		
  }
}
