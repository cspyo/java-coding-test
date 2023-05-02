package TeamNote;

import java.util.*;

public class MinAndMax {
    public static void main(String[] args) {
        int[] intArray = { 3, 27, 13, 8 };

		int max = Arrays.stream(intArray).max().getAsInt();
		int min = Arrays.stream(intArray).min().getAsInt();

		System.out.println(min + " " + max);


        ArrayList<Integer> arrayList = new ArrayList<>();
        int max2 = Collections.max(arrayList);
        int min2 = Collections.min(arrayList);

		System.out.println(min2 + " " + max2);

    }
}
