
// Time Complexity : O(length of array)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2)
            return nums.length;
        int index=2,i=2,flg=nums[1]==nums[0]?1:0,prev=nums[1];
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                if(flg==0){
                    flg=1;
                    nums[index++]=nums[i];
                }
            }else{
                nums[index++]=nums[i];
                flg=0;
            }
            i++;
        }
        
        return index;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        /* edge case */
        if( nums == null || nums.length == 0)
            return 0;

        /* intialize the array pointer */
        int i = 0;

        /*iterate over array values */
        for (int n : nums)
         /* if i is less than 2 or valye is greater than last value then that value is to kept else move to next element in array*/
          if (i < 2 || n > nums[i - 2])
            nums[i++] = n;

        /* final index of array which is length of array*/
        return i;

    }
}
