package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbers {
public static void main(String[] args) {
	int[]nums= {4,3,2,7,8,2,3,1};
	//int[]nums= {1,1};
	System.out.println(findDisappearedNumbers(nums));
}
public static List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int val : nums) {
        set.add(val);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i<= nums.length; i++) {
        if (!set.contains(i)) {
            list.add(i);
        }
    }
    return list;
}
}

