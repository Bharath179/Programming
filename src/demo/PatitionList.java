package demo;

import java.util.Arrays;
import java.util.List;

public class PatitionList {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,3,2,5,2);
        int x = 3;

        partitionList(numbers, x);

        System.out.println("Partitioned List:" + numbers);
    }

    public static void partitionList(List<Integer> list, int x) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            while (list.get(left) < x) {
                left++;
            }

            while (list.get(right) >= x && right > 0) {
                right--;
            }

            if (left < right) {
                // Swap elements at positions left and right
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);

                left++;
                right--;
            }
        }
    }

}
