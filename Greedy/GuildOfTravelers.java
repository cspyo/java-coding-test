package Greedy;
import java.util.*;

public class GuildOfTravelers {
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in );

        int n = sc.nextInt();
        List<Integer> travelers = new ArrayList<>();

        for (int i=0; i<n; i++){
            travelers.add(sc.nextInt());
        }
        
        Collections.sort(travelers);

        int result = 0;
        int count = 0;

        for (int i : travelers) {
            count += 1;
            if (count >= i) {
                result += 1;
                count = 0;
            }
        }  
        System.out.println(result);
    }
}
