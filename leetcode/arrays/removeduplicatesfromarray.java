class Solution {
    public int removeDuplicates(int[] nums) {
        
        int uniqueNums = 0;

            for(int currentNum : nums){

                if(uniqueNums == 0 || currentNum != nums[uniqueNums - 1]){

                    nums[uniqueNums++]=currentNum;

                }
            }
            return uniqueNums;
    }
}
