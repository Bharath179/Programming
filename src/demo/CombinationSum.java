package demo;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
public static void main(String[] args) {
	int[] candidates= {2,3,6,7};
	int target=7;
	System.out.println(combinationSum(candidates,target));
}

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper(0,candidates, target, new ArrayList<>(), finalList);
        return finalList;
    }
    public static void helper(int index, int[] arr, int target, ArrayList<Integer> list, List<List<Integer>> finalList){
        if(index == arr.length){
            if(target == 0){
                finalList.add(new ArrayList<>(list));
            }
            return;
        }
        if(target >= arr[index]){
            list.add(arr[index]);
            helper(index, arr, target-arr[index],list,finalList);
            list.remove(list.size()-1);
        }
        helper(index+1, arr,target,list,finalList);
    }
}

