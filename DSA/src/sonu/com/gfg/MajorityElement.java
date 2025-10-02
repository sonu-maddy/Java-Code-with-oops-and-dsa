package sonu.com.gfg;

import java.io.FilterOutputStream;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
      int  arr[] = {2 ,1, 6, 6, 6, 6, 6, 5, 5, 5, 5};
        System.out.println(findMajority(arr));
    }

   static public List<Integer> findMajority(int[] nums) {
        // Your code goes here.

       // this code take more time O(n*n)
//        int n = nums.length;
//        List<Integer> list = new ArrayList<>(n/3);
//
//        for (int i = 0; i < nums.length ; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]){
//                    count++;
//                }
//
//
//            }
//            if (count > n/3 && !list.contains(nums[i])){
//                list.add(nums[i]);
//            }
//
//        }
//       Collections.sort(list);
//
//        return list;


//
//       Map<Integer, Integer> map = new HashMap<>();
//       List<Integer> list = new ArrayList<>(map.keySet());
//       for (int i = 0; i < nums.length-1 ; i++) {
//           int num =nums[i];
//           if(map.containsKey(num)){
//               map.put(num, map.get(num)+1);
//           }else {
//
//               map.put(num,1);
//           }
//
//       }
//
//       for (int i= 0; i <map.size() ; i++) {
//
//           int key = map.get(i);
//           if (map.getOrDefault(key,0)  > nums.length/3){
//               list.add(key);
//           }
//       }
//
//       Collections.sort(list);
//       return list;




       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();
       List<Integer> list = new ArrayList<>();

       // Count occurrences
       for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }

       // Check for majority elements
       for (int key : map.keySet()) {
           if (map.get(key) > n / 3) {
               list.add(key);
           }
       }

       // Sort the result list
       Collections.sort(list);

       return list;
   }







}
