package solutions_leetcode;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/
public class two_sums {
	    public int[] twoSum(int[] nums, int target) {
	        
	    	// initialize the answer array
	        int[] submit = new int[2];
	        
	        
	        // loop through the array picking an element and comparing it with the other elements in the same array
	        
	        for(int i = 0; i < nums.length; i++){
	            for(int j = 0; j < nums.length; j++){
	            	// Do not compare the element with itself
	                if(i!=j){
	                	// target is attainded. Assign answer array and return
	                    if((nums[i]+nums[j]) == target){
	                        submit[0] = i;
	                        submit[1] = j;
	                        return submit;
	                    }
	                }
	            }
	        }
	        return submit;
	        
	    }

}
